/*
 * Fa�a um programa Java utilizando a IDE eclipse, para cada quest�o descrita a seguir:
1. Uma empresa tem para um determinado funcion�rio uma ficha contendo o n�mero de horas trabalhadas e o n 0 de dependentes de um funcion�rio.

Considerando que:

a) A empresa paga 12 reais por hora e 40 reais por dependentes. 
b) Sobre o sal�rio s�o feito descontos de 8,5% para o INSS e 5% para IR.

Fa�a um algoritmo para ler o n�mero de horas trabalhadas e n�mero de dependentes de 5 funcion�rios. Ap�s a leitura das informa��es de cada funcion�rio
escreva qual sal�rio bruto, os valores descontados para cada tipo de
imposto e finalmente qual o sal�rio l�quido de cada funcion�rio.
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
			System.out.println("Digite os dados do funcion�rio "+(cont+1));
			System.out.print("\nInforme o n�mero de horas trabalhadas: ");
			horas = ler.nextInt();
			System.out.print("Informe o n�mero de dependentes do funcion�rio: ");
			numDep = ler.nextInt();
			
			double calcDep = numDep * 40.00;
			double salarioBruto = (valHora * horas) + calcDep;
			double descInss = salarioBruto * inss;
			double descIR = salarioBruto * ir;
			double salarioLiquido =  salarioBruto - (descInss + descIR);
			
			System.out.println("O seu sal�rio bruto �: R$"+salarioBruto);
			System.out.println("O seu sal�rio l�quido � de: R$"+salarioLiquido);
			System.out.println("O total de descontos � de R$ "+(descInss + descIR));
			System.out.println();
			cont++;
		}while (cont < 5);

	}

}
