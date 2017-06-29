import java.util.Scanner;

public class Automovel {
	private int ano;
	private String marca;
	private String modelo;
	private String cor;
	private double valor;

	public Automovel() {
		// Aqui é executado o teste do valor digitado no ano, utilizando Try/Catch.
		setAno(verificaAno(Integer.parseInt(digita("Digite o ano de fabricação: "))));
		setMarca(digita("Digite a marca: "));
		setModelo(digita("Digite o modelo: "));
		setCor(digita("Digite a cor: "));
		setValor(Double.parseDouble(digita("Digite o valor: ")));
	}

	private int verificaAno(int anoDigitado) {
		try {
			int ano = anoDigitado;
			if (ano > 1700 && ano < 2018)
				return ano;
			System.out.println("Valor inválido. Digite um valor entre 1700 e 2018.");
		} catch (Exception e) {
			System.out.println("Erro. Digite um valor válido para o ano.");
		}
		return verificaAno(Integer.parseInt(digita("Digite novamente o ano: ")));
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	private static String digita(String msg) {
		System.out.print(msg);
		return new Scanner(System.in).nextLine();
	}

	public String mostraVeiculo() {
		// Mostra os valores das variáveis. Também utilizado pelo metodo listaBarato().
		return "Lista Automoveis:\n" + "Ano: " + this.ano + " Marca: " + this.marca + " Modelo: " + this.modelo
				+ " Valor: R$ " + this.valor;
	}
}
