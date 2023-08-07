/*6-Faça um programa em Java que leia dois números inteiros e escreva
 * os números inteiros que estão no intervalo compreendido entre eles.
 */

import java.util.Scanner;

public class IntervaloEntreNumeros {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o 1º número: ");
		int numero1 = leitor.nextInt();
		
		System.out.print("Digite o 2º número: ");
		int numero2= leitor.nextInt();
			
		if (numero1<numero2) {
			for (int i=++numero1; i < numero2; i++) {
				
				System.out.println("O intervalo �: "+numero1++);
			
		   }
		
		} else {
			
			for (int i= ++numero2; i < numero1; i++) {
				
				System.out.println("O intervalo �: "+numero2++);
		    
			}

			
		}
			
	}

}
