import java.util.Scanner;

public class Produto {
	private String caneta;
	private int quantidade;
	private int precoUnit;
	private double totalPag;
	private double desconto;
	private double totalVenda;

	public Produto() {
		setCaneta(digita("Digite a cor da caneta: "));
		setQuantidade(Integer.parseInt(digita("Quantidade: ")));
		setPrecoUnit(Integer.parseInt(digita("Pre�o unit�rio: ")));
		calculaPedido();
		System.out.println(mostraPedido());

	}

	public String getCaneta() {
		return caneta;
	}

	public void setCaneta(String caneta) {
		this.caneta = caneta;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getPrecoUnit() {
		return precoUnit;
	}

	public void setPrecoUnit(int precoUnit) {
		this.precoUnit = precoUnit;
	}

	public double getTotalPag() {
		return totalPag;
	}

	public void setTotalPag(double totalPag) {
		this.totalPag = totalPag;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(double totalVenda) {
		this.totalVenda = totalVenda;
	}

	public void calculaPreco() {

	}

	public String mostraPedido() {
		return "Caneta: " + this.caneta + "\nQuantidade: " + this.quantidade + "\nValor unit�rio: R$ " + this.precoUnit
				+ "\nValor total: R$ " + this.totalPag + "\nValor de desconto: R$ " + this.desconto
				+ "\nValor total: R$ " + this.totalVenda;
	}

	public void calculaPedido() {
		double total = quantidade * precoUnit;
		setTotalPag(total);
		try {
			if (quantidade > 0 && quantidade <= 5)
				this.desconto = 2.0;
			if (quantidade > 5 || quantidade < 10)
				this.desconto = 3.0;
			if (quantidade > 10)
				this.desconto = 5.0;

		} catch (Exception e) {
			System.out.println("Erro. Quantidade inv�lida.");
		}

		double valDesconto = totalPag * desconto / 100;
		setTotalVenda(totalPag- valDesconto);
	}

	private static String digita(String msg) {
		System.out.print(msg);
		return new Scanner(System.in).nextLine();
	}
}
