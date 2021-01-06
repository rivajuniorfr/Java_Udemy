package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Dizer se um numero é par ou impar
		
		int numero;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero");
		numero = entrada.nextInt();
		
		if (numero % 2 == 0) {
			
			System.out.println("O numero é par");
		}
		else {
			
			System.out.println("O numero é impar");
		}
		
		
		entrada.close();

	}

}
