/*Faça um programa Java que leia 100 números e informe a média dos números.
 */

import java.util.Scanner;

public class MediaWhile {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double soma=0;
		int contador =0;
		
		while (contador<10) {
			System.out.print("Digite um número ["+(contador+1)+"]: ");
			int numero = leitor.nextInt();
			
			contador++;
			
			soma+=numero;
			
			
		}
         double media = soma/contador;
         
         System.out.print("");
         System.out.print("Media dos números: "+media);
	}

}
