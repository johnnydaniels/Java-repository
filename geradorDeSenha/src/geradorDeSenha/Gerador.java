package geradorDeSenha;

import java.util.Random;
import java.util.Scanner;

public class Gerador {

	public static void main(String[] args) {
		while (true) {
			switch (digita(menu()).charAt(0)) {
			case '1':
				criaNumerica();
				break;
			case '2':
				criaAlfaNum();
				break;
			case '3':
				criaEspecial();
				break;
			case '4':
				System.exit(0);
			}
		}
	}

	private static void criaNumerica() {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		String[] simbolos = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String b = "";
		System.out.print("Digite o numero de caracteres para sua senha: ");
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			int a = ran.nextInt(simbolos.length);
			b += simbolos[a];
		}
		System.out.print("Senha gerada: " + b + "\n\n");
	}

	private static void criaAlfaNum() {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		String[] simbolos = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h",
				"i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C",
				"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X",
				"Y", "Z" };
		String b = "";
		System.out.print("Digite o numero de caracteres para sua senha: ");
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			int a = ran.nextInt(simbolos.length);
			b += simbolos[a];
		}
		System.out.print("Senha gerada: " + b + "\n\n");
	}

	private static void criaEspecial() {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		String[] simbolos = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h",
				"i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C",
				"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X",
				"Y", "Z", "'", "@", "#", "$", "%", "&", "*", "(", ")", "-", "+", "=", "!", "?", "~", "^", "{", "}", "[",
				"]", "|", "." };
		String b = "";
		System.out.print("Digite o numero de caracteres para sua senha: ");
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			int a = ran.nextInt(simbolos.length);
			b += simbolos[a];
		}
		System.out.print("Senha gerada: " + b + "\n\n");
	}

	private static String digita(String msg) {
		Scanner e = new Scanner(System.in);
		System.out.print(msg);
		return e.nextLine();
	}

	private static String menu() {
		String menu = "";
		menu += "======================================================\n";
		menu += "  Gerador de senha - v0.1\n";
		menu += "======================================================\n";
		menu += " \n";
		menu += "Qual a complexidade da senha?\n";
		menu += " \n";
		menu += " 1 - Somente números\n";
		menu += " 2 - Alfanumérica\n";
		menu += " 3 - Alfanumérica com caracteres especiais\n";
		menu += " 4 - Sair\n";
		menu += " \n";
		menu += "Digite a opção: ";
		return menu;
	}
}
