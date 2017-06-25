
/*Crie uma classe chamada 'Tapete', com atributos: corPrincipal (String), lagura (double) e comprimento(double), todos privados.
Crie os getters e setters para esta classe. Crie também o método toString.
Crie uma classe chamada 'Principal' com um array estático chamado vTapetes[], com 10 posições. 
O método main() deverá estar nesta classe e, apartir dele controlar a digitação do vetor.
Crie os métodos necessários para digitar os dados e também um método para imprimir o vetor/array vTapetes. 
 */
import java.util.Scanner;

public class Principal {
	static int tamanho = 10;

	static Tapete vTapete[] = new Tapete[tamanho];

	public static void main(String[] args) {

		do {
			System.out.println("Menu ----------------\n");
			System.out.println(" 1 - Inserir tapete");
			System.out.println(" 2 - Modificar tapete");
			System.out.println(" 3 - Listar tapetes");
			System.out.println(" 4 - Sair");
			System.out.print("\nDigite uma opção: ");
			int op = new Scanner(System.in).nextInt();
			if (op == 1)
				insereTapete();
			// break;
			if (op == 2)
				modificaTapete();
			// break;
			if (op == 3)
				listaTapetes();
			// break;
			if (op == 4)
				System.exit(0);
		} while (true);
	}// ------------------------------------------------------------------------------

	private static void modificaTapete() {
		listaTapetes();
		System.out.println("Escolha um tapete: ");
		int ind = new Scanner(System.in).nextInt();

		System.out.println("Digite a nova cor: ");
		String novaCor = new Scanner(System.in).nextLine();
		vTapete[ind].setCorPrincipal(novaCor);

		System.out.println("Digite a nova largura: ");
		double novaLarg = new Scanner(System.in).nextDouble();
		vTapete[ind].setLagura(novaLarg);

		System.out.println("Digite a nova largura: ");
		double novoComp = new Scanner(System.in).nextDouble();
		vTapete[ind].setComprimento(novoComp);
	}// ------------------------------------------------------------------------------

	private static void insereTapete() {
		for (int k = 0; k < tamanho; k++)
			if (vTapete[k] == null) {
				vTapete[k] = new Tapete();
				return;
			}

		System.out.println("....Erro! ");
	}// ------------------------------------------------------------------------------

	private static void listaTapetes() {
		System.out.println("Tapetes:");
		for (int i = 0; i < vTapete.length; i++) {
			if (vTapete[i] != null)
				System.out.println(i + " - Cor: " + vTapete[i].getCorPrincipal() + ", Largura: "
						+ vTapete[i].getLagura() + ", Comprimento: " + vTapete[i].getComprimento());
		}
	}// ------------------------------------------------------------------------------

	private static String digita(String msg) {
		Scanner e = new Scanner(System.in);
		System.out.print(msg);
		return e.nextLine();
	}// ------------------------------------------------------------------------------

}// ----------------------------------------------------------------------------------
