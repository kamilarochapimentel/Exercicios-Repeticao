/*Faça um programa em Java que peça dois números, base e expoente,
 * calcule e mostre o primeiro número elevado ao segundo número.
 * Utiliza estruturas de repetição para resolver o problema. * 
 */

import java.util.Scanner;

public class NumeroExponencial {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Digite a BASE do calculo: ");
		int base = leitor.nextInt();
		
		System.out.print("Digite o EXPOENTE: ");
		int expoente = leitor.nextInt();
		
		int contador=0;
		int resultadoFinal =1;
		
	    while (expoente!=contador) {
	    	contador++;
	    	
			if (expoente==0) {
				resultadoFinal=1;
			}
			
			else if (expoente==1) {
				resultadoFinal=base;
			}
			
			else {
			resultadoFinal=resultadoFinal*base;
			
			}
			
		}
		
		System.out.println("Resultado do calculo exponencial: " +resultadoFinal);
		
	}  
}
