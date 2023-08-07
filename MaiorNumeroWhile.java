/* 4-Fa�a um programa em Java que leia 50 n�meros e informe o maior n�mero.
 */

import java.util.Scanner;

public class MaiorNumeroWhile {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int contador=0;
		int numeroMaior=0;
		
		while (contador<50) {
			
			System.out.print("Digite um n�mero " +(contador+1)+ ": ");
			int numero = leitor.nextInt();
			
			contador++;
			
			if (numero>numeroMaior) {
				numeroMaior=numero;
				
		    }
			
		}
		
		System.out.println("");
		System.out.print("O maior n�mero �: "+numeroMaior);
		

	}

}
