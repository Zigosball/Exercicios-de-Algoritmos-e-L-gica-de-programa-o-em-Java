/******************************************************************************
Escreva um ªprograma para receber dois valores reais.
Mostrar:
se o 1º valor é maior que o 2º valor;
se o 2º valor é maior que o 1º valor;
se os valores são iguais   

Obs: Validar para que cada valor seja positivo (maior que 0)

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	System.out.print("Digite de 1 - 3 ");
	int valor1 = input.nextInt();
	int valor2 = input.nextInt();
    
    while (valor1 && valor2 < 1) {
         System.out.print("Número invalido, digite novamente!: ");
        valor1 = input.nextInt();
        valor2 = input.nextInt();
     }
	if (valor1 > valor2) {
	    System.out.print("Se a cor for Verde: Siga");
	    } else if (semaforo == 2) {
	        System.out.print("Se a cor for Amarelo: Atenção");
	    } else {
	        System.out.print("Se a cor for Vermelho: Pare");
	    }
	       
		input.close();
	}
}
