/******************************************************************************
Escreva um programa para receber um número correspondente a cor do semáforo, sendo:
1 – Verde
2 – Amarelo
3 – Vermelho

Mostrar:
Se a cor for Verde: Siga
Se a cor for Amarelo: Atenção
Se a cor for Vermelho: Pare

Obs: Validar para só aceitar cor válida (1 a 3)
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	System.out.print("Digite de 1 - 3: ");
	int semaforo = input.nextInt();
    
    while (semaforo > 3 || semaforo < 1) {
        
        System.out.print("Número invalido, digite novamente!: ");
        semaforo = input.nextInt();
     }
	if (semaforo == 1) {
	    System.out.print("Se a cor for Verde: Siga");
	    } else if (semaforo == 2) {
	        System.out.print("Se a cor for Amarelo: Atenção");
	    } else { System.out.print("Se a cor for Vermelho: Pare");
	    }
		input.close();
	}
}
