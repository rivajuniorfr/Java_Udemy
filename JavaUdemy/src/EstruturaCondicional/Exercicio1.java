package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// Verificar se um numero é negativo
		
		int numero;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o numero: ");
		numero = entrada.nextInt();
		
		if(numero < 0) {
			
			System.out.println("O numero é negativo");
		}
		else {
			
			System.out.println("O numero é positivo");
		}
		entrada.close();
	}

}
