import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mediaAproveitamento = 0;
		int numIdent = 0;
		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		int mediaExercicios = 0;
		String conceito = ""; 
		String resultado = ""; 
		
		System.out.print("Informe o número da identidade: ");
		numIdent = ler.nextInt();		
		System.out.print("Informe a primeira nota: ");
		nota1 = ler.nextInt();		
		System.out.print("Informe a segunda nota: ");
		nota2 = ler.nextInt();		
		System.out.print("Informe a terceira nota: ");
		nota3 = ler.nextInt();		
		System.out.print("Informe a média dos exercícios: ");
		mediaExercicios = ler.nextInt();
		
		mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + (mediaExercicios))/7;
		

		if (mediaAproveitamento >= 90){
			conceito ="A";
		}
		
		if (mediaAproveitamento >=75 && mediaAproveitamento < 90){
			conceito ="B";
			
		}
		if (mediaAproveitamento >=60 && mediaAproveitamento < 75){
			conceito ="C";
		}
		if (mediaAproveitamento >=40 && mediaAproveitamento < 60){
			conceito ="D";
		}
		if (mediaAproveitamento <40){
			conceito = "E";
		}
		
		if (conceito =="A" || conceito =="B" || conceito =="C"){
			resultado = "APROVADO";
		}
		
		if (conceito == "D" || conceito == "E"){
			resultado = "REPROVADO";
		}
		
		System.out.println("\nSeu número de identidade: "+numIdent);
		System.out.println("Sua primeira nota é: "+nota1);
		System.out.println("Sua segunda nota é: "+nota2);
		System.out.println("Sua terceira nota é: "+nota3);
		System.out.println("A média dos exercícios é: "+mediaExercicios);
		System.out.println("A sua média é: "+mediaAproveitamento);
		System.out.println("Seu conceito é "+conceito+". Você está "+resultado);
	}    
		
}
