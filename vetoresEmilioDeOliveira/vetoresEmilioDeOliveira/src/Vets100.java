
/*
Nome: Emilio de Oliveira
Data: 13/06/2017
 */
import java.util.Scanner;

public class Vets100 {
	static int tamanho = 5;
	static int soma = 0;
	static int indMaior = 0;
	static int indMenor = 0;

	static int vGeral[] = new int[tamanho];
	static int vMaior[] = new int[tamanho];
	static int vMenor[] = new int[tamanho];

	public static void main(String[] args) {
		do {
			leNumero();
			System.out.println("Deseja continuar? S/N");
			char op = new Scanner(System.in).next().charAt(0);
			calculaSoma(soma);
			mostraArrays();

			if (op == 'N' || op == 'n')
				System.exit(0);
		} while (true);
	}//------------------------------------------------------------------------------

	private static void mostraArrays() {
		System.out.print("vGeral: [ ");
		for (int k = 0; k < tamanho; k++) {
			System.out.print(vGeral[k] + " ");
		}
		System.out.println("]");

		System.out.print("vMenor: [ ");
		for (int k = 0; k < tamanho; k++) {
			System.out.print(vMenor[k] + " ");
		}
		System.out.println("]");

		System.out.print("vMaior: [ ");
		for (int k = 0; k < tamanho; k++) {
			System.out.print(vMaior[k] + " ");
		}
		System.out.println("]");

	}//------------------------------------------------------------------------------

	private static void leNumero() {
		soma = 0;
		for (int k = 0; k < tamanho; k++) {
			int numero = Integer.parseInt(digita("Digite um valor para o array " + k + ": "));
			vGeral[k] = numero;
			soma = vGeral[k] + soma;
		}
	}//------------------------------------------------------------------------------

	private static void calculaSoma(int soma) {
		if (soma > 0 && soma < 100) {
			vMenor[indMaior] = soma;
			indMaior++;
		}
		if (soma >= 100) {
			vMaior[indMenor] = soma;
			indMenor++;
		}
	}//------------------------------------------------------------------------------

	private static String digita(String msg) {
		Scanner ler = new Scanner(System.in);
		System.out.print(msg);
		return ler.nextLine();
	}//------------------------------------------------------------------------------

}
