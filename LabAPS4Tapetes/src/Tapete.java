import java.util.Scanner;

/*Crie uma classe chamada 'Tapete', com atributos: corPrincipal (String), lagura (double) e comprimento(double), todos privados.
 
 */
public class Tapete {
	private String corPrincipal;
	private double lagura;
	private double comprimento;

	public Tapete() {
		System.out.print("Cor principal: ");
		setCorPrincipal(new Scanner(System.in).nextLine());
		System.out.print("Largura: ");
		setLagura(new Scanner(System.in).nextDouble());
		System.out.print("Comprimento: ");
		setComprimento(new Scanner(System.in).nextDouble());
		
	}

	public String getCorPrincipal() {
		return corPrincipal;
	}

	public void setCorPrincipal(String corPrincipal) {
		this.corPrincipal = corPrincipal;
	}

	public double getLagura() {
		return lagura;
	}

	public void setLagura(double lagura) {
		this.lagura = lagura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	private static String digita(String msg) {
		Scanner e = new Scanner(System.in);
		System.out.print(msg);
		return e.nextLine();
	}
	
	public String toString() {
		return "Tapete [" + getCorPrincipal() + ", " + getLagura() + ", " + getComprimento() + "]";
	}

}
