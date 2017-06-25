import java.util.Scanner;

public class Times {
	private String nomeTime;
	private int classificacao;

	public Times() {
		System.out.print("Nome do time: ");
		setNomeTime(new Scanner(System.in).nextLine());
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	private static String digita(String menu) {
		Scanner a = new Scanner(System.in);
		System.out.println(menu);
		return a.nextLine();
	}

}
