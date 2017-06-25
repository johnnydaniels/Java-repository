import java.util.Scanner;

public class Coordenadas {
	public static void main(String[] args) {
		Ponto ponto = new Ponto();
				
		do{
			System.out.println("As coordenadas atuais são: \nCoordenada X: "+ponto.coordenadaX+"\nCoordenada Y: "+ponto.coordenadaY);
			System.out.println("\nDigite a opção: ");
			System.out.println("1 - Incrementar");
			System.out.println("2 - Drecrementar");
			System.out.println("3 - Zerar coordenadas");
			System.out.println("4 - Sair");
			int op = new Scanner(System.in).nextInt();
			
			if (op == 1)
				ponto.incrementaCoord();
			if (op == 2)
				ponto.decrementaCoord();
			if (op == 3)
				ponto.Construtor();
			if (op == 4)
				System.exit(0);
		}while (true);		
	}
}