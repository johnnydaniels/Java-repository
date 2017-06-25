import java.util.Scanner;

public class Ponto {
	static int coordenadaX = 0;
	static int coordenadaY = 0;
	static int construtor = 0;
	
	public static int getCoordenadaX() {
		return coordenadaX;
	}
	public static void setCoordenadaX(int coordenadaX) {
		Ponto.coordenadaX = coordenadaX;
	}
	public static int getCoordenadaY() {
		return coordenadaY;
	}
	public static void setCoordenadaY(int coordenadaY) {
		Ponto.coordenadaY = coordenadaY;
	}
	
	public void Construtor(){
		int zeraValor = 0;
		setCoordenadaX(zeraValor);
		setCoordenadaY(zeraValor);
		System.out.println("Os valores foram reiniciados!");
	
	}
	public void incrementaCoord(){
		System.out.print("Digite o valor que gostaria de incrementar na coordenada X: ");
		int valX = new Scanner(System.in).nextInt();
		System.out.print("Digite o valor que gostaria de incrementar na coordenada Y: ");
		int valY = new Scanner(System.in).nextInt();
		int novaCoordX = coordenadaX + valX;
		int novaCoordY = coordenadaY + valY;
		setCoordenadaX(novaCoordX);
		setCoordenadaY(novaCoordY);
		
	}
	
	public void decrementaCoord(){
		System.out.print("Digite o valor que gostaria de subtrair na coordenada X: ");
		int valX = new Scanner(System.in).nextInt();
		System.out.print("Digite o valor que gostaria de subtrair na coordenada Y: ");
		int valY = new Scanner(System.in).nextInt();
		int novaCoordX = coordenadaX - valX;
		int novaCoordY = coordenadaY - valY;
		setCoordenadaX(novaCoordX);
		setCoordenadaY(novaCoordY);
		
	}
}
