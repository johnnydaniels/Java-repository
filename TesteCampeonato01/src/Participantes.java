import java.util.Scanner;

public class Participantes {

	private String nome;
	private int idade;
	private Times time;
	private int pontuacao;

	public Participantes(Times time) {
		setNome(digita("Nome do participante: "));
		setIdade(Integer.parseInt(digita("Idade:")));
		setPontuacao(Integer.parseInt(digita("Pontuação: ")));
		setTime(time);

	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Times getTime() {
		return time;
	}

	public void setTime(Times time) {
		this.time = time;
	}

	private static String digita(String menu) {
		Scanner a = new Scanner(System.in);
		System.out.println(menu);
		return a.nextLine();
	}

	public String toString() {
		return "Nome [" + nome + ", " + time.getNomeTime() + ", " + pontuacao + "]";
	}

}
