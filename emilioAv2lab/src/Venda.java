import java.util.Arrays;
import java.util.Scanner;

public class Venda {
	static Automovel vAutomovel[] = new Automovel[20];

	public static void main(String[] args) {
		String menu = "\n";
		menu += "\nMENU";
		menu += "\n=========================";
		menu += "\n 1 - Cadastra Automovel";
		menu += "\n 2 - Lista Automoveis";
		menu += "\n 3 - Lista Mais Barato";
		menu += "\nEscolha: ";
		char op;
		while (true) {
			switch (digita(menu).charAt(0)) {
			case '1':
				cadastraAutomovel();
				break;
			case '2':
				listaAutomoveis();
				break;
			case '3':
				listaBarato();
				break;
			}
		}
	}

	private static void cadastraAutomovel() {
		// Verifica se o array tem a última posição disponível, caso positivo inicializa o construtor.
		if (vAutomovel[vAutomovel.length - 1] == null)
			for (int k = 0; k < vAutomovel.length; k++) {
				if (vAutomovel[k] == null) {
					vAutomovel[k] = new Automovel();
					break;
				}
			}
		else
			System.out.println("Erro. Não é possível realizar mais cadastros.");
	}

	private static void listaAutomoveis() {
		for (int k = 0; k < vAutomovel.length; k++)
			if (vAutomovel[k] != null)
				System.out.println(vAutomovel[k].mostraVeiculo());
	}

	private static void listaBarato() {
		// Faz o comparativo da variável "a" e "menor", caso seja menor valor,
		// retorna o indice para o metodo mostraVeiculo().
		int indice = 0;
		double menor = Double.MAX_VALUE;
		for (int k = 0; k < vAutomovel.length; k++) {
			if (vAutomovel[k] != null) {
				double a = vAutomovel[k].getValor();
				if (a < menor) {
					menor = a;
					indice = k;
					
				}
			} else
				break;
		}
			System.out.println(vAutomovel[indice].mostraVeiculo());
	}

	private static String digita(String msg) {
		System.out.print(msg);
		return new Scanner(System.in).nextLine();
	}
}
