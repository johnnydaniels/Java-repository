import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double imc = 0;
		double peso = 0;
		double altura = 0;
	   
		System.out.print("Informe o peso: ");
		peso = ler.nextDouble();
	
		System.out.print("Informe a altura: ");
		altura = ler.nextDouble();
	
		imc= peso / (altura*altura);
			System.out.println("O seu IMC é: "+imc+"\nA sua condição é");
	
		if (imc<18.5){
			System.out.println("Abaixo do peso");
		}

		if (imc>=18.5 && imc <25){
			System.out.println("Peso normal");
		}
		if(imc>=25 && imc<30){
			System.out.println("Acima do peso");
		}
		
		if(imc>=30){
			System.out.println("Obeso");
		}
	}
}
