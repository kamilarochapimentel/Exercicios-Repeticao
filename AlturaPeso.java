/* Uma academia deseja fazer um senso entre seus clientes para descobrir o mais
 * alto, o mais baixo, a mais gordo e o mais magro, para isto você deve fazer
 * um programa em Java que pergunte a cada um dos clientes da academia seu
 * código, sua altura e seu peso.
 * 
 * O final da digitação de dados deve ser
 * dada quando o usuario digitar 0 (zero) no campo código. Ao encerrar 
 * o programa também deve ser informados os códigos e valores do clente mais
 * alto, do mais baixo, do mais gordo e do mais magro, além da m�dia das alturas
 * e dos pesos dos clientes.*/


import java.util.Scanner;
import java.text.DecimalFormat;


public class AlturaPeso {

	public static void main(String[] args) {
		
		int codMaior = 0;
		int codMenor = 1000;
		double maisBaixo = 1000;
		double maisAlto = 0;
		double gordo = 0;
		double magro = 1000;
		double menorMassa = 1000;
		double maiorMassa = 0;
		
		Scanner leitor = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat ("0.00");
		
		
		while (true) {
			System.out.print("Digite o codigo ou [0] para encerrar: ");
			int novoCodigo= leitor.nextInt();
			if (novoCodigo==0) {
				break;
			}
			
			System.out.print("Qual a altura: ");
			double novaAltura = leitor.nextDouble();
						
			System.out.print("Qual o peso: ");
			double novoPeso = leitor.nextDouble();
				
			System.out.println("");
		
			double pesoIdeal = (72.7*novaAltura) - 58;
			pesoIdeal = novoPeso - pesoIdeal;
			
			
			if (novaAltura>=maisAlto) {
				maisAlto=novaAltura;
				codMaior=novoCodigo;
			}
			
			if (novaAltura<=maisBaixo) {
				maisBaixo=novaAltura;
				codMenor=novoCodigo;
			}
			
			if (pesoIdeal>=maiorMassa) {
				maiorMassa = pesoIdeal;
				codMaior=novoCodigo;
			}
			
			if (pesoIdeal<=menorMassa) {
				menorMassa= pesoIdeal;
				codMenor = novoCodigo;
			}
		}
		
		System.out.println("");
		System.out.println("maior altura: " +deci.format(maisAlto) + ". Código: "+codMaior);
		System.out.println("menor altura: " +deci.format(maisBaixo) + ". Código: " +codMenor);
		System.out.println("mais gordo: " + deci.format(maiorMassa) + ". Código: "+codMaior);
		System.out.println("Mais magro: " + deci.format(menorMassa) + ". Código: " +codMenor);

	}

}
