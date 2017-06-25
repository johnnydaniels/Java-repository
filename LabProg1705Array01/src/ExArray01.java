import java.util.Scanner;
public class ExArray01 {
	static final int tamanho = 20;
	static Pessoa pessoas[] = new Pessoa[tamanho];
	static int indice = 0;

	public static void main(String[] args) {
		Pessoa pessoas[] = new Pessoa[20];
		
		Pessoa cliente = new Pessoa();
		int op;
		do{
			System.out.println("\nMENU");
			System.out.println("0- Finaliza");
			System.out.println("1- Cadastro");
			System.out.println("2- Listagem");
			System.out.println("3- Localização");
			System.out.print  ("   Escolha: ");
			
			op = new Scanner(System.in).nextInt();
			
			if (op == 0)
				System.exit(0);
			if (op == 1)
				cadastro();
			if (op == 2)
				listagem();
			if (op == 3);
				localiza();
		}while(true);
		
	}

	private static void localiza() {
		String nome;
		System.out.print("Digite o nome para localizar: ");
		nome = new Scanner(System.in).nextLine();
		
		for(int k=0 ; k<indice ; k++)
			if(nome.equals(pessoas[k].getNome()))
				System.out.println("Achei o "+nome+" na posição "+k+" do array.");
	}

	private static void listagem() {
		for(int k=0 ; k<indice ; k++)
			System.out.println(pessoas[k].getNome());
		
	}

	private static void cadastro() {
		if (indice < pessoas.length)
			pessoas[indice++] = pes();
		else
			System.out.println("Erro. Cadastro inviabilizado.");
		
	}

	private static Pessoa pes() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(digita("Nome:"));
		pessoa.setIdade(Integer.parseInt(digita("Idade: ")));
		pessoa.setSalario(Double.parseDouble(digita("Salario: ")));
		
		return pessoa;
	}

	private static String digita(String string) {
		System.out.print("Digite "+string);
		return new Scanner(System.in).nextLine();
	}

}