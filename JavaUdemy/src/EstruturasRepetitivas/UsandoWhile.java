package EstruturasRepetitivas;

import java.util.Scanner;

public class UsandoWhile {

	public static void main(String[] args) {
		
		// Enquanto o numero for diferente de 0, fazer a soma dos numeros
		
		Scanner entrada = new Scanner (System.in);
		int n;
		System.out.println("Digite um numero");
		n = entrada.nextInt();
		int soma = 0 ;
		while (n != 0) {
			soma += n;
			n = entrada.nextInt();
			
			
		}
		
		System.out.println("A soma é: " + soma);
		
		
		entrada.close();
	}

}
