package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Saber se um numero � multiplo do outro
		
		int n1,n2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		System.out.println("Digite o segundo numero");
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 ==0) {
			
			System.out.println(" S�o multiplos");
		}
		else {
			
			System.out.println("N�o s�o multiplos");
		}
			
		
		
		
		entrada.close();

	}

}
