import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//int i = 0;
		
         /*vai contar do numero q eu colocar at� a decima posicao.
		se eu colocar maior q o valor 10 vai printar uma vez*/
		System.out.print("Digite um n�mero inteiro positivo: ");
		int i = leitor.nextInt();

			
		do {
			
			System.out.println(i);
			i++;
		} while (i < 10); 
			
			


	}

}
