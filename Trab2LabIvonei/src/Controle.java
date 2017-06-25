import java.util.Scanner;

public class Controle {
	//Favor escrever seu nome aqui:
	//Nome:
	
	static final int tamanho = 3;
	
	static Partido  vPartido[]  = new Partido[tamanho];
	static Deputado vDeputado[] = new Deputado[tamanho];
		
	public static void main(String[] args) {
		while (true){
			switch(digita(menu()).charAt(0)){
			case '1': cadastraPartido();
			break;
			case '2': listaPartido();
			break;
			case '3': cadastraDeputado();
			break;
			case '4': listaDeputado();
			break;
			case '5': listaCorrupto();
			break;
			}
		}
	}

	private static void listaCorrupto() {
		System.out.println("Deputados Corruptos:");
		for (int i = 0; i < vDeputado.length; i++) {
			if(vDeputado[i]!=null)
				if(vDeputado[i].getIndicadorCorrupcao() == 4 ||vDeputado[i].getIndicadorCorrupcao() == 5)
				System.out.println(i+" - "+vDeputado[i]);
		}
	}

	private static void listaDeputado() {
		System.out.println("Deputados:");
		for (int i = 0; i < vDeputado.length; i++) {
			if(vDeputado[i]!=null)
				System.out.println(i+" - "+vDeputado[i]);
		}
	}

	private static Partido escolhePartido(){
		listaPartido();
		return vPartido[(digita("Escolha um partido: "))];
	}
	
	private static void cadastraDeputado() {
		for(int k=0 ; k<tamanho ; k++)
			if(vDeputado[k] == null){
				vDeputado[k] = new Deputado(escolhePartido());
				return;
			}
		
		System.out.println("....Erro. Fale com o Ceará! ");
	}

	private static void listaPartido() {
		System.out.println("Partidos:");
		for (int i = 0; i < vPartido.length; i++) {
			if(vPartido[i]!=null)
				System.out.println(i+" - "+vPartido[i].getSigla()+", "+vPartido[i].getNumero());
		}
	}

	private static void cadastraPartido() {
		
		for(int k=0 ; k<tamanho ; k++)
			if(vPartido[k] == null){
				vPartido[k] = new Partido();
				return;
			}
		
		System.out.println("....Erro! ");
	}

	private static String digita(String menu) {
		Scanner e = new Scanner(System.in);
		System.out.print(menu);
		return e.nextLine();
	}

	private static String menu(){
		String menu = "";
		menu += "\nMENU";
		menu += "\n=======";
		menu += "\n1-Cadastrar Partidos.";
		menu += "\n2-Listagem de Partidos.";
		menu += "\n3-Cadastrar Deputados.";
		menu += "\n4-Listagem de Deputados.";
		menu += "\n5-Listagem dos Corruptos.";
		menu += "\n  Escolha: "; 
		return menu;
	}
}
