package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		
		int hi, hf, duracao;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a hora inicial do jogo");
		System.out.println("Digite a hora final ");
		hi = entrada.nextInt();
		hf = entrada.nextInt();
		duracao =  hi - hf;
		
		
		
		if(duracao < 1 || duracao > 24 ) {
			
			System.out.println("Tempo irregular");
		}
		else {
			
			System.out.println("O tempo de jogo foi " + duracao +" horas");
		}
		
		
		entrada.close();

	}

}
