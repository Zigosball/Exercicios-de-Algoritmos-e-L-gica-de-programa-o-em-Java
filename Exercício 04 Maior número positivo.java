/******************************************************************************

Escreva um programa para receber 5 números inteiros positivos e mostrar o maior deles
Criticar cada número recebido para ser recebido apenas números positivos.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
	System.out.println("Digite 5 números inteiros positivos:  ");
	
	System.out.print("Digite o primeiro:  ");
	int num1 = input.nextInt();
		
	System.out.printf("Digite o segundo:  ");
	int num2 = input.nextInt();
			
	System.out.printf("Digite o terceiro:  ");
	int num3 = input.nextInt();	
		
	System.out.printf("Digite o quarto:  ");
	int num4 = input.nextInt();	
		
	System.out.printf("Digite o quinto:  ");
	int num5 = input.nextInt();	
		
    while (num1 <= 0) {
	    
     System.out.print("O número 1 tem um valor invalido, digite um número positivo:   ");
	    
	    num1 = input.nextInt();
    }    
	 
	while (num2 <= 0) {
	    
     System.out.print("O número 2 tem um valor invalido, digite um número positivo:   ");
	    
	    num2 = input.nextInt();
    }    
	  
	while (num3 <= 0) {
	    
     System.out.print("O número 3 tem um valor invalido, digite um número positivo:   ");
	    
	    num3 = input.nextInt();
    }   
	
	 while (num4 <= 0) {
	    
     System.out.print("O número 4 tem um valor invalido, digite um número positivo:   ");
	    
	    num4 = input.nextInt();
    }       
	 
	 while (num5 <= 0) {
	    
     System.out.print("O número 5 tem um valor invalido, digite um número positivo:   ");
	    
	    num5 = input.nextInt();
    }
	  
	    int maior = num1; 

        
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        if (num4 > maior) {
            maior = num4;
        }
        if (num5 > maior) {
            maior = num5;
        }

        System.out.println("\nO maior número é: " + maior);
	
		input.close();
	}
}
