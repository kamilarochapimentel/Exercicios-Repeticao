/*2. Faça um programa em Java que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido e continue
 * pedindo até que o usuário informe um valor válido. 
 */

import java.util.Scanner;

public class ImprimirNota {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
	    System.out.print("Digite uma nota: ");
	    int nota = leitor.nextInt();
	    
	    while (nota>10 | nota<0) {
	    	
	    	System.out.println("VALOR INVALIDO");
	    	System.out.println(" ");
	    	System.out.print("Digite uma nota: ");
	    	
	    	int novaNota = leitor.nextInt();
	    	nota = novaNota;
	    	
	    }
	    System.out.println(" ");
	    System.out.println("NOTA VALIDA. Nota: " +nota);

	}

}
