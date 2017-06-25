import java.util.Scanner;

public class Partido {
	private String sigla;
	private int    numero;
	
	public Partido() {
		System.out.print("Sigla: ");
//		sigla = new Scanner(System.in).nextLine();
		setSigla(new Scanner(System.in).nextLine());
		
		
		System.out.print("Numero: ");
		numero = new Scanner(System.in).nextInt();
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
