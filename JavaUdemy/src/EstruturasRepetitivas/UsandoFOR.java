package EstruturasRepetitivas;

import java.util.Scanner;

public class UsandoFOR {

	public static void main(String[] args) {
		
		// Fazer a soma de n numeros digitados
		
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		
		int soma = 0;
		
		for(int i=0 ; i < n ; i++) {
			
			int x = entrada.nextInt();
			soma = soma + x;
			
		}
		
		System.out.println(soma);
		
		
		entrada.close();

	}

}
