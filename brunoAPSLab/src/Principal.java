import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		char op;
		while (true) {
			lePedido();
			switch (digita("Deseja continuar? [S/N]").toUpperCase().charAt(0)) {
			case 'S':
				lePedido();
				break;
			case 'N':
				System.exit(0);
			}
		}
	}

	private static void lePedido() {
		Produto produto = new Produto();
	}

	private static String digita(String msg) {
		System.out.print(msg);
		return new Scanner(System.in).nextLine();
	}
}