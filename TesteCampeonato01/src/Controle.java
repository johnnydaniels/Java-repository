import java.util.Scanner;

public class Controle {
	static final int tamanho = 4;

	static Participantes vParticipantes[] = new Participantes[tamanho];
	static Times vTimes[] = new Times[tamanho];

	public static void main(String[] args) {
		while (true) {
			switch (digita(menu()).charAt(0)) {
			case '1':
				cadastraTimes();
				break;
			case '2':
				cadastraParticipantes();
				break;
			case '3':
				listaTimes();
				break;
			case '4':
				listaParticipantes();
				break;
			case '5':
				cadastraPontuacao();
				break;
			case '6':
				listaPlacar();
				break;
			case '7':
				System.exit(0);

			}
		}

	}

	private static void listaParticipantes() {
		System.out.println("Participantes:");
		for (int i = 0; i < vParticipantes.length; i++) {
			if (vParticipantes[i] != null)
				System.out.println(i + " - " + vParticipantes[i]);
		}

	}

	private static void listaPlacar() {
		System.out.println("Em desenvolvimento!");

	}

	private static int cadastraPontuacao() {
		listaParticipantes();
		int a = Integer.parseInt(digita("Escolha um participante: "));

		int pontuacao = Integer.parseInt(digita("Digite a pontuação: "));
		vParticipantes[a].setPontuacao(pontuacao);
		return pontuacao;

	}

	private static void listaTimes() {
		System.out.println("Times:");
		for (int i = 0; i < vTimes.length; i++) {
			if (vTimes[i] != null)
				System.out.println(i + " - " + vTimes[i].getNomeTime() + ", " + vTimes[i].getClassificacao());
		}

	}

	private static Times escolheTime() {
		listaTimes();
		return vTimes[Integer.parseInt(digita("Escolha um time: "))];
	}

	private static void cadastraParticipantes() {
		for (int k = 0; k < tamanho; k++)
			if (vParticipantes[k] == null) {
				vParticipantes[k] = new Participantes(escolheTime());
				return;
			}

		System.out.println("....Erro! ");

	}

	private static void cadastraTimes() {

		for (int k = 0; k < tamanho; k++)
			if (vTimes[k] == null) {
				vTimes[k] = new Times();
				return;
			}

		System.out.println("....Erro! ");

	}

	private static String digita(String menu) {
		Scanner a = new Scanner(System.in);
		System.out.println(menu);
		return a.nextLine();
	}

	private static String menu() {
		String menu = "";
		menu += "\n==========================================";
		menu += "\nMenu - Campeonato v0.1";
		menu += "\n==========================================";
		menu += "\n1 - Cadastrar times.";
		menu += "\n2 - Cadastra participantes.";
		menu += "\n3 - Lista de times.";
		menu += "\n4 - Listagem de participantes.";
		menu += "\n5 - Cadastra pontuação.";
		menu += "\n6 - Placar.";
		menu += "\n7 - Sair.";
		menu += "\n  Escolha: ";
		return menu;
	}

}
