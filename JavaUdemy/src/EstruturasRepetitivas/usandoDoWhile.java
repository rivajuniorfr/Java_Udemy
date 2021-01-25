package EstruturasRepetitivas;

import java.util.Scanner;

public class usandoDoWhile {

	// Programa transforma a temperatura de Celsius em Fahrenheit enquanto a resposta for sim
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		char resp;
		
		do {
		
		System.out.print("Digite a temperatura em graus Celsius: ");
		double c = entrada.nextDouble();
		double f = 9.0 * c / 5 + 32;
		System.out.printf("A temperatura em Fahrenheit é: %.1f Graus%n", f );
		System.out.print("Deseja repetir (s/n)?: ");
		resp = entrada.next().charAt(0);
		} while(resp != 'n' );
		
		
		entrada.close();
		
		System.out.println("Fim do programa");

	}
	
	

}
