import java.util.Scanner;

public class Vidracaria {
	static Pedido vPedido[] = new Pedido[20];
	
	public static void main(String[] args) {
		String menu = "\n";
		menu += "\nMENU";
		menu += "\n=========================";
		menu += "\n1- Cadastra Pedido";
		menu += "\n2- Relatório Geral";
		menu += "\n3- Localiza o Pedido";
		menu += "\n   Escolha: ";
		
		while(true){
			switch(digita(menu).charAt(0)){
			case '1': cadastraPedido();  break;
			case '2': listaPedidos()  ;  break;
			case '3': localizaPedido();  break;
			
			default:
				System.out.println("Erro. Opção não válida.");
			}
		}
	}

	private static void localizaPedido() {
		boolean clienteEncontrado = false;
		
		if (vPedido[0] != null){
			String cliente = digita("...Digite o nome para localizar o cliente: ");
			for(Pedido pedido : vPedido)
				if (pedido!=null)
					if (cliente.toLowerCase().equals(pedido.getNome().toLowerCase())){
						System.out.println(pedido.mostraPedido2());
						clienteEncontrado = true;
					}
			if (!clienteEncontrado)
				System.out.println("Erro. Pedido não localizado. ");
		}		
		else
			System.out.println("Erro. Não há lista de Pedidos.");
	}

	private static void listaPedidos() {
		System.out.println("Lista de Pedidos: Total de entregas: "+total()+" Valor total: "+valorTotal());
		for (int k=0; k<vPedido.length ; k++)
			if(vPedido[k]!= null)
				System.out.println(vPedido[k].mostraPedido());
	}

	private static double valorTotal() {
		double soma = 0;
		for(int k=0 ; k<vPedido.length ; k++)
			if (vPedido[k] != null)
				soma += vPedido[k].getPreco();
			else break;
		return soma;
	}

	private static int total() {
		int cont = 0;
		for(cont=0 ; cont<vPedido.length ; cont++)
			if (vPedido[cont] != null);
			else break;
		return cont;
	}

	private static void cadastraPedido() {
		if(vPedido[vPedido.length-1] == null)
			for(int k=0 ; k<vPedido.length; k++){
				if(vPedido[k] == null){
					vPedido[k] = new Pedido();
					if(vPedido[k].retonar()){
						vPedido[k] = null;
						break;
					}
				}
			}
		else 
			System.out.println("Erro. Não é possível realizar mais pedidos.");
		
	}


	private static String digita(String mensagem) {
		System.out.print(mensagem);
		return new Scanner(System.in).nextLine();
	}

}
