import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite um número inteiro positivo: ");
		int numero = leitor.nextInt();

		for (int i = 0; i < numero; i++) {
			System.out.print(i + ", ");
		}

	}

}
