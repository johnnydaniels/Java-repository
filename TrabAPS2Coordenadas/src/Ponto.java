import java.util.Scanner;

public class Ponto {
	static Coordenadas coord = new Coordenadas();

	public static void main(String[] args) {
		do {
			// Criei um m�todo para o menu, o que economizou v�rias linhas.
			int op = Integer.parseInt(digita(menuInicial()));
			if (op == 1)
				coord.incrementaCoord();
			if (op == 2)
				coord.decrementaCoord();
			if (op == 3)
				coord.Coordenadas();
			if (op == 4)
				System.exit(0);
		} while (true);
	}

	private static String digita(String menu) {
		Scanner a = new Scanner(System.in);
		System.out.println(menu);
		return a.nextLine();
	}

	private static String menuInicial() {
		String menu = "";
		menu += "\nDigite a op��o: ";
		menu += "\n1 - Incrementar";
		menu += "\n2 - Drecrementar";
		menu += "\n3 - Zerar coordenadas";
		menu += "\n4 - Sair";
		return menu;
	}
}
