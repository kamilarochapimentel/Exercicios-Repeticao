/* 4-Fa�a um programa em Java que leia 50 n�meros e informe o maior n�mero.
 */

import java.util.Scanner;

public class MaiorNumeroFor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int maiorNumero=0;
		
		for (int i = 0;i<50; i++) {
			System.out.print("digite um número " + (i+1) + ": ");
			int numero = leitor.nextInt();
			
			if (numero>=maiorNumero) {
				maiorNumero=numero;
				
			}
			
		}
		
         System.out.println();
         System.out.println("O maior numero digitado foi: " +maiorNumero);
	}

}
