/*Faça um algoritmo para que o um usuário tente acertar um
 * número informado por outro usuário. Inicialmente um usuário
 * fornece um número para o algoritmo, depois o outro usuário deve
 * informar números ao algoritmo até acertar (obviamente o segundo
 * usuário não deve ver o número informado pelo primeiro). Para
 * ajudar, a cada tentativa o computador deve exibir as seguintes
 * mensagens: "Seu número é maior do que o meu" ou "Seu número é menor
 * do que o meu". Ao acertar imprima quantas tentativa foram necessárias.
 */

import java.util.Scanner;

public class AcertaNumero {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int contador = 0;
				
		System.out.print("Usuario 1 informe um número: ");
		int usuario1=leitor.nextInt();
		System.out.println("");
		
		while (true){
			
			System.out.print("Digite um número: ");
			int usuario2=leitor.nextInt();
			contador++;
			
			if (usuario1==usuario2) {
				System.out.println("");
				System.out.println("Você encontrou o número: "+usuario2);
				break;
			}
			
			if (usuario2<usuario1) {
				System.out.println("Seu número é MENOR do que o meu");
				System.out.println("");
			}
			
			if (usuario2>usuario1) {
				System.out.println("Seu número é MAIOR do que o meu");
				System.out.println("");
		    }
		
		}
		
		System.out.print("Número de tentativas: " +contador);
	}

}
