package EstruturasRepetitivas;

import java.util.Scanner;

public class Exercicio1While {

	public static void main(String[] args) {
		
		// Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. senha 2002
		
		int senha ;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite a senha: ");
		senha = entrada.nextInt();
		
		while(senha != 2002) {
			
			System.out.println(" senha inv�lida");
			senha = entrada.nextInt();
		}
		
		System.out.println(" Acesso permitido");
		
		entrada.close();

	}

}
