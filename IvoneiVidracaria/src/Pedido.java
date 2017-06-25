import java.util.Scanner;

public class Pedido {
	private String dataPedido     ;
	private String nomeCliente    ;
	private String enderecoCliente;
	private String telefoneCliente;
	private String dataEntrega    ;
	private String corVidro       ;
	private double espessura      ;
	private double preco          ;

	public Pedido(){
		setNomeCliente(digita("Nome do Cliente [Enter para retornar ao menu]: "));
		if (retonar())
			return;
		setEnderecoCliente(digita("Endereço do "+nomeCliente+": "));
		setTelefoneCliente(digita("Telefone do Sr(a) "+nomeCliente+": "));
		setDataPedido(verificaDataPedido(digita("...Data do pedido: ")));
		setDataEntrega(verificaDataPedido(digita("...Data de Entrega: ")));
		setCorVidro(escolheCor());
		setEspessuta(escolheEspessura());
		setPreco(verificaPreco(digita("...Preço: ")));
	}

	public boolean retonar() {
		if(this.nomeCliente.length() == 0)
			return true;
		return false;
	}

	private void setPreco(double preco) {
		this.preco = preco;
	}

	private double verificaPreco(String precoDigitado) {
		try{
			double preco = Double.parseDouble(precoDigitado);
			if (preco >= 0)
				return preco;
			System.out.println("Erro. preço não deve ser negativo.");
		}catch(Exception e){
			System.out.println("Erro. Digite um valor válido para o preço.");
		}
		return verificaPreco(digita("...Preço: "));
	}

	private void setEspessuta(double espessura) {
		this.espessura = espessura;
	}

	private double escolheEspessura() {
		double espessura[] = {10, 0.8, 0.6, 0.3};
		while(true){
			System.out.println("\n-------------Espessuras Disponívies: ");
			for (int k=0; k<espessura.length ; k++)
				System.out.println(espessura[k]);
			try{
				double espes = Double.parseDouble(digita("...Escolha a espessura do vidro: "));
				for(int k=0 ; k<espessura.length ; k++)
					if (espes == espessura[k])
						return espes;
				System.out.println("Erro. Espessura não existe. ");
			}catch(Exception e){
				System.out.println("Erro. Espessura não válida. ");
			}
		}
	}

	private String escolheCor() {
		String cor[] = {"Verde","Branco","Escuro"};
		while(true){
			System.out.println("\n-------------Cores disponiveis: ");
			for(int k=0 ; k<cor.length ; k++)
				System.out.println(cor[k]);
			String corEscolhida = digita("...Escolha cor do vidro: ");
			for(int k=0 ; k<cor.length ; k++)
				if (cor[k].toUpperCase().equals(corEscolhida.toUpperCase()))
					return corEscolhida;
		}
	}

	private void setCorVidro(String corVidro) {
		this.corVidro = corVidro;
	}

	private void setDataEntrega(String data) {
		this.dataEntrega = data;
		
	}

	private String verificaDataPedido(String data) {
			if(data.length()==10 && separadorOk(data) && diaOk(data) && mesOk(data) && anoOk(data))
				return data;
			System.out.println("Erro. Data incorreta. ");
			return verificaDataPedido(digita("...Digite a Data novamente: "));
			
	}

	private boolean anoOk(String data) {
		try{
			int ano = Integer.parseInt((String) data.subSequence(6, 10));
			if(ano>0 && ano < 2018)
				return true;
		}catch(Exception e){
			System.out.println("Erro. Data não é válida. ");
		}
		return false;
	}

	private boolean mesOk(String data) {
		try{
			int mes = Integer.parseInt((String) data.subSequence(3, 5));
			if(mes>0 && mes < 13)
				return true;
		}catch(Exception e){
			System.out.println("Erro. Data não é válida. ");
		}
		return false;
	}
	
	private boolean diaOk(String data) {
		try{
			int dia = Integer.parseInt((String) data.subSequence(0, 2));
			if(dia>0 && dia < 31)
				return true;
		}catch(Exception e){
			System.out.println("Erro. Data não é válida. ");
		}
		return false;
	}

	private boolean separadorOk(String data) {
		if(data.charAt(2)=='/' && data.charAt(5)=='/')
			return true;
		return false;
	}

	private void setDataPedido(String pedido) {
		this.dataPedido = pedido;
		
	}

	private void setTelefoneCliente(String telefone) {
		this.telefoneCliente = telefone;
	}

	private void setEnderecoCliente(String endereco) {
		this.enderecoCliente = endereco;
	}

	private void setNomeCliente(String nome) {
		this.nomeCliente = nome;
	}

	private String digita(String string) {
		System.out.print(string);
		return new Scanner(System.in).nextLine();
	}
	
	public double getPreco(){
		return this.preco;
	}

	public String mostraPedido(){
		return  "      Data Entrega: "+this.dataEntrega+
				"\n           Cliente: "+this.nomeCliente+
				" Fone: "+this.telefoneCliente+
				"\n           Endereço:"+this.enderecoCliente+
				" Valor: "+this.preco;
	}
	
	public String mostraPedido2(){
		return  "\nCliente: "+this.nomeCliente+
				" Fone: "+this.telefoneCliente+
				"\n           Endereço:"+this.enderecoCliente+
				" Valor: "+this.preco+
				"\n           Data entrega: "+this.dataEntrega;
	}

	public void setCliente(String nome){
		this.nomeCliente = nome;
	}
	public String getNome(){
		return this.nomeCliente;
	}
}
