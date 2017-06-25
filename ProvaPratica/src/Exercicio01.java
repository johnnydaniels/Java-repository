/*
 * Faça um programa Java utilizando a IDE eclipse, para cada questão descrita a seguir:
1. Uma empresa tem para um determinado funcionário uma ficha contendo o número de horas trabalhadas e o n 0 de dependentes de um funcionário.

Considerando que:

a) A empresa paga 12 reais por hora e 40 reais por dependentes. 
b) Sobre o salário são feito descontos de 8,5% para o INSS e 5% para IR.

Faça um algoritmo para ler o número de horas trabalhadas e número de dependentes de 5 funcionários. Após a leitura das informações de cada funcionário
escreva qual salário bruto, os valores descontados para cada tipo de
imposto e finalmente qual o salário líquido de cada funcionário.
 */

import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int horas = 0;
		int cont = 0;
		int numDep = 0;
		double valHora = 12.00;
		double inss = 0.085;
		double ir = 0.05;
		
		do{
			System.out.println("Digite os dados do funcionário "+(cont+1));
			System.out.print("\nInforme o número de horas trabalhadas: ");
			horas = ler.nextInt();
			System.out.print("Informe o número de dependentes do funcionário: ");
			numDep = ler.nextInt();
			
			double calcDep = numDep * 40.00;
			double salarioBruto = (valHora * horas) + calcDep;
			double descInss = salarioBruto * inss;
			double descIR = salarioBruto * ir;
			double salarioLiquido =  salarioBruto - (descInss + descIR);
			
			System.out.println("O seu salário bruto é: R$"+salarioBruto);
			System.out.println("O seu salário líquido é de: R$"+salarioLiquido);
			System.out.println("O total de descontos é de R$ "+(descInss + descIR));
			System.out.println();
			cont++;
		}while (cont < 5);

	}

}
