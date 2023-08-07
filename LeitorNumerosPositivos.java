/*1. Faça um programa em Java que leia uma quantidade
 * indefinida de números positivos e imprima cada um deles.
 * Números negativos indicamo fim das leituras.
 */

import java.util.Scanner;

public class LeitorNumerosPositivos {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		double numero=0;
				
		while (numero >= 0) {
			System.out.println("numero: "+ numero);
			
			System.out.print("digite um número: " );
			double substituto = leitor.nextDouble();
			numero = substituto;
			
		}
		
		System.out.println("");
		System.out.print("FIM DO PROGRAMA");

		
	}

}
