/*
 Crie um projeto AlgTrabalho01_SeuNome


A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. 
Faça um algoritmo para coletar dados sobre o salário e números de filhos de 
cada habitante e após as leituras, escrever:
- Média de salário da população;
- Média de número de filhos;
- Maior salário dos habitantes;
- Percentual de pessoas com salário menor que R$ 150,00.

obs.: O final das leituras se dará com a entrada de um "salário negativo".
 */
import java.util.Scanner;
public class Pesquisa01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario = 0;
		double somaSalario = 0 ;
		double somaFilhos = 0;
		double numFilhos = 0;
		double maiorSalario = 0;
		double mediaSalario = 0;
		float contHab = 0;
		float contMenor = 0;
		char continuar;
		boolean contTest = true;
	
		System.out.println(
							"--------------------------------------------------------------------------------"+
							"\n			Pesquisa de habitantes"+
							"\n--------------------------------------------------------------------------------"
							);
		while (contTest){
			
			System.out.print("Digite sua renda: ");
			salario = ler.nextDouble();
			System.out.print("Digite o número de filhos: ");
			numFilhos = ler.nextDouble();
			System.out.println("Deseja continuar? [S/N] ");
			continuar = ler.next().charAt(0);
			
			if (salario > maiorSalario){
				maiorSalario = salario;
			}			
			somaSalario = salario + somaSalario;
			somaFilhos = numFilhos + somaFilhos;
			contHab++;
			
			if (salario < 150.00){
				contMenor++;
			}

			if (continuar == 'S' || continuar == 's'){
				contTest = true;
			}else {
				contTest = false;
			}
		}
		
		mediaSalario = somaSalario / contHab;
		double mediaFilhos = (numFilhos / contHab);
		System.out.println(
							"--------------------------------- Resultados ------------------------------------"+
							"\nO número de habitantes pesquisados foi de "+contHab+
							"\nA média Salarial dos habitantes é de R$ "+mediaSalario+
							"\nO maior salário é de R$ "+maiorSalario+
							"\nA média de filhos por habitante é de "+mediaFilhos+" filhos."+
							"\nAporcentagem de pessoas que ganham menos de R$ 150 é de: "+ ((contMenor/contHab)*100)+"%"
							);
		}

	}
	



