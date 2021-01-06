package EstruturasRepetitivas;

import java.util.Scanner;

public class Exercicio2While {

	public static void main(String[] args) {
		/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/
		
		int x,y;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite Ponto x:");
		System.out.println("Digite Ponto y: ");
		x = entrada.nextInt();
		y = entrada.nextInt();
		
		while (x != 0 || y != 0 ) {
			
			System.out.print(x + ",");
			System.out.println(y);			
			x = entrada.nextInt();
			y = entrada.nextInt();	
			
		}
		
		
		
		entrada.close();

	}

}
