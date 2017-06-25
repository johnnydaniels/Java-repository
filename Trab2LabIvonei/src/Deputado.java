import java.util.Scanner;

public class Deputado {
	private String  nome;
	private Partido partido;
	private int     numero;
	private int     indicadorCorrupcao;
	
	public Deputado(Partido partido) {
		setNome(digita("Nome Deputado: "));
		setNumero(Integer.parseInt(digita("Numero:")));
		setIndicadorCorrupcao(Integer.parseInt(digita("Indicador de Corrupção: ")));
		setPartido(partido);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getIndicadorCorrupcao() {
		return indicadorCorrupcao;
	}

	public void setIndicadorCorrupcao(int indicadorCorrupcao) {
		this.indicadorCorrupcao = indicadorCorrupcao;
	}

	@Override
	public String toString() {
		return "nome [" + nome + ", " + partido + ", " + numero + ", "
				+ indicadorCorrupcao + "]";
	}
	
	private static String digita(String menu) {
		Scanner e = new Scanner(System.in);
		System.out.print(menu);
		return e.nextLine();
	}

}
