import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {
	static int tamanho = 5;
	static Funcionario vFuncionario[] = new Funcionario[tamanho];
	Funcionario func = new Funcionario();

	public static void main(String[] args) {
		tamanhoCadastro();
		while (true) {
			switch (digita(menu())) {
			case "1":
				cadastraFuncionario();
				break;
			case "2":
				consultarFuncionario();
				break;
			case "3":
				listaFuncionarios();
				break;
			case "4":
				listaFuncionariosAtivos();
				break;
			case "5":
				listaFuncionarioCresc();
				break;
			case "10":
				System.out.println("... Programa finalizado!");
				System.exit(0);

			default:
				System.out.println("Erro! Escolha uma op��o v�lida.");
			}
		}
	}

	private static void listaFuncionariosAtivos() {
		for (int k = 0; k < vFuncionario.length; k++) {
			if (vFuncionario[k] != null)
				if (vFuncionario[k].getSituacao() == "Ativo")
					System.out.println(vFuncionario[k].mostraFuncionario());
		}
	}

	private static void listaFuncionarios() {
		if (vFuncionario[0] == null)
			System.out.println("Cadastro vazio.");
		for (int k = 0; k < vFuncionario.length; k++) {
			if (vFuncionario[k] != null)
				System.out.println(vFuncionario[k].mostraFuncionario());
		}
	}

	private static void tamanhoCadastro() {
		System.out.println("Digite a quantidade de funcion�rios: ");
		int num = new Scanner(System.in).nextInt();
		tamanho = num;
		return;
	}

	private static void cadastraFuncionario() {
		if (vFuncionario[vFuncionario.length - 1] == null)
			for (int k = 0; k < tamanho; k++) {
				if (vFuncionario[k] == null) {
					vFuncionario[k] = new Funcionario();
					return;
				}
			}
		System.out.println("N�o � poss�vel cadastrar mais funcion�rios!");
	}

	private static void consultarFuncionario() {
		String nome = digita("Digite o nome do funcion�rio: ");
		for (int k = 0; k < vFuncionario.length; k++) {
			if (vFuncionario[k].getNome().equalsIgnoreCase(nome)) {
				System.out.println("Nome: " + vFuncionario[k].getNome());
				System.out.println("Idade: " + vFuncionario[k].getIdade());
				System.out.println("Situacao: " + vFuncionario[k].getSituacao());
			}
		}
	}

	private static void listaFuncionarioCresc() {
		Funcionario[] copiaListaFunc = new Funcionario[tamanho];
		if (vFuncionario[0] == null)
			System.out.println("Cadastro vazio.");
		
		for (int i = 0; i < vFuncionario.length; i++) {
			copiaListaFunc[i] = vFuncionario[i];
		}
		
		
		for (int i = 0; i < copiaListaFunc.length; i++) {
			int menorIdadeIndex = 0;
			boolean trocou = false;
			try {
				for (int j = i; j < copiaListaFunc.length; j++) {
					if (copiaListaFunc[menorIdadeIndex] != null
							&& copiaListaFunc[menorIdadeIndex].getIdade() > copiaListaFunc[j].getIdade()) {
						menorIdadeIndex = j;
						trocou = true;
					}
				}
				if (trocou) {
					Funcionario funci = copiaListaFunc[i];
					copiaListaFunc[i] = copiaListaFunc[menorIdadeIndex];
					copiaListaFunc[menorIdadeIndex] = funci;
				}
			} catch (Exception ex) {
			}
		}

		for (int i = 0; i < copiaListaFunc.length; i++) {
			if (copiaListaFunc[i] != null)
				System.out.println(
						"Funcionario: " + copiaListaFunc[i].getNome() + "  Idade: " + copiaListaFunc[i].getIdade());

		}
		//return;

	}

	public static String digita(String msg) {
		Scanner a = new Scanner(System.in);
		System.out.print(msg);
		return a.nextLine();
	}

	public static String menu() {
		String menu = "";
		menu += "Menu: \n 1 - CADASTRAR FUNCION�RIO";
		menu += "\n 2 - CONSULTAR FUNCION�RIO";
		menu += "\n 3 - LISTAR TODOS FUNCION�RIOS";
		menu += "\n 4 - LISTAR SOMENTE FUNCION�RIOS ATIVOS";
		menu += "\n 5 - LISTAR FUNCION�RIOS EM ORDEM DE IDADE CRESCENTE";
		menu += "\n 10 - SAIR";
		menu += "\nSelecione: ";
		return menu;
	}
}
