/*Faça um programa Java que leia 100 numeros e informe a media dos números.
 */

import java.util. Scanner;

public class MediaFor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double soma =0;
		int contador=0;
		
		for (int i=0; i<10; i++) {
			System.out.print("Digite um n�mero [" +(i+1) +"]: ");
			int numero = leitor.nextInt();
			contador++;
			soma = soma + numero;
			
		}
		
		double media = soma/contador;
		
		System.out.println("");
		System.out.print("Media dos número: "+media);

	}

}
