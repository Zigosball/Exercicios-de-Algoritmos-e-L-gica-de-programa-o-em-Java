/******************************************************************************
Escreva um programa para receber 5 números inteiros positivos e mostrar o maior deles

Desafio: 
Criticar cada número recebido para ser recebido apenas números positivos.
A definição se o número é positivo, fazer através de sub rotina, que deve receber o número e retornar true ser for positivo ou false se não for positivo.
Se o maior número se repetir, mostrar quantas vezes ele se repete.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Digite um valor real:  ");
		int valor1 = input.nextInt();
		
		System.out.printf("Digite o segundo valor real:  ");
		int valor2 = input.nextInt();
		
		while (valor1 < 0 || valor2 < 0) {
		    
		    System.out.printf("Por favor, digite um número positivo:");
		
		valor1 = input.nextInt();
	    valor2 = input.nextInt();
	    
		}
		
		if (valor1 > valor2) {
		    
		    System.out.println("O maior valor é o Valor 1:" + valor1);
	}
	else if (valor2 > valor1) {
	    
	    System.out.println("O maior valor é o Valor 2:" + valor2);
	}
		else if (valor1 == valor2) { 
		    
		    System.out.println("Os dois valores são iguais:" + valor1);
		    System.out.println("Os dois valores são iguais:" + valor2);
		}
		
		
		
		input.close();
	}
}
