import java.util.Scanner;

public class Funcionario {
	private String nome;
	private int idade;
	private String situacao;

	public Funcionario() {
		setNome(digita("Digite o nome: "));
		setIdade(Integer.parseInt(digita("Digite a idade: ")));
		setSituacao(lerSituacao());
	}

	private String lerSituacao() {
		String sit;
		System.out.println("Selecione a situa��o do funcion�rio:\n1 - Ativo\n2 - Inativo");
		int a = new Scanner(System.in).nextInt();
		if (a == 1)
			return sit = "Ativo";
		return sit = "Inativo";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if ((nome.length() < 3) || (nome.length() > 30)) {
			throw new IllegalArgumentException("Nome inv�lido. M�nimo 3 caracteres, M�ximo 30 caracteres.");
		}
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if ((idade <= 0) || (idade >= 99))
			throw new IllegalArgumentException("Idade inv�lida, Minimo 1, m�ximo 99");
		this.idade = idade;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String mostraFuncionario() {
		return "Nome = " + this.nome + ", Idade = " + this.idade + ", Situa��o =" + this.situacao;
	}

	public static String digita(String msg) {
		Scanner a = new Scanner(System.in);
		System.out.println(msg);
		return a.nextLine();
	}

}
