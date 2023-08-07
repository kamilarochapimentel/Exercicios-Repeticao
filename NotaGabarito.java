/*8-Fa�a um algortimo que calcule e exiba a nota de um aluno
 * em uma prova de 10 quest�es. Para calcular a nota do aluno
 * deve-se ler do usu�rio a resposta de cada uma das 10 quest�es
 * e comparar com o gabarito abaixo.
 * 01 - A ; 02 - B ; 03 - C ; 04 - D ; 05 - E ;
 * 06 - E ; 07 - D ; 08 - C ; 09 - B ; 10 - A
 */

import java.util.Scanner;

public class NotaGabarito {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	    int[] questoes = {1,2,3,4,5,6,7,8,9,10};
		int contador=0;
				
			for (int questao : questoes) {
				System.out.print("Digite sua resposta da questão " +(questao)+" [A,B,C,D,E]: ");
				String resposta = leitor.nextLine().toUpperCase();
				
				if (questao==1 && resposta.equals("A")) {
					contador++;
					
					}
				if (questao==2 && resposta.equals("B")) {
					contador++;
					
					}
				if (questao==3 && resposta.equals("C")) {
					contador++;
					
					}
				if (questao==4 && resposta.equals("D")) {
					contador++;
					
					}
				if (questao==5 && resposta.equals("E")) {
					contador++;
					
					}
				if (questao==6 && resposta.equals("E")) {
					contador++;
					
					}
				if (questao==7 && resposta.equals("D")) {
					contador++;
					
					}
				if (questao==8 && resposta.equals("C")) {
					contador++;
					
					}
				if (questao==9 && resposta.equals("B")) {
					contador++;
					
					}
				if (questao==10 && resposta.equals("A")) {
					contador++;
					
					}
				
				
			}
		System.out.println(" ");			
		System.out.print("Nota Final: " +contador);	
	}
}
