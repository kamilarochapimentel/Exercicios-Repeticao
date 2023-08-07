import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro positivo: ");
		int numero = leitor.nextInt();

		while (numero > 0) {
			System.out.print(numero + ", ");
			numero--;
		}
		System.out.println("FOGO!!!");
		}
}
