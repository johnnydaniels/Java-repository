/*
 Crie um projeto AlgTrabalho01_SeuNome


A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. 
Fa�a um algoritmo para coletar dados sobre o sal�rio e n�meros de filhos de 
cada habitante e ap�s as leituras, escrever:
- M�dia de sal�rio da popula��o;
- M�dia de n�mero de filhos;
- Maior sal�rio dos habitantes;
- Percentual de pessoas com sal�rio menor que R$ 150,00.

obs.: O final das leituras se dar� com a entrada de um "sal�rio negativo".
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
			System.out.print("Digite o n�mero de filhos: ");
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
							"\nO n�mero de habitantes pesquisados foi de "+contHab+
							"\nA m�dia Salarial dos habitantes � de R$ "+mediaSalario+
							"\nO maior sal�rio � de R$ "+maiorSalario+
							"\nA m�dia de filhos por habitante � de "+mediaFilhos+" filhos."+
							"\nAporcentagem de pessoas que ganham menos de R$ 150 � de: "+ ((contMenor/contHab)*100)+"%"
							);
		}

	}
	



