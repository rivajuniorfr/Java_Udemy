package outrasFuncoes;

import java.util.Scanner;

public class FuncoesSintaxe {

	public static void main(String[] args) {
		
		// Raiz quadrada com Math.sqrt
		
		double x = Math.sqrt(25.0);
		double y = 49;
		System.out.println(x);
		System.out.println(Math.sqrt(y));
		System.out.println(Math.sqrt(y) + x);
		System.out.println();
		System.out.println();
		System.out.println();
		
				
		// Retorna o maior dos 3 numeros digitados
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os 3 numeros");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		
		int maior =  max(a,b,c);
		mostraResultado(maior);
		
		entrada.close();

	}
	
	// Funcao com if para verificar e retornar o maior numero digitado
	
	public static int max(int x,int y, int z) {
		int aux;
		
		if (x > y && x > z) {
			aux = x;
						
		} 
		else if (y > z) {
			aux =  y;
	    }
		else {
			aux = z;
		}
		
		
		return aux;
		
	}
	
	// Funcao void(vazio), nao retorna valor
	
	public static void mostraResultado(int valor) {
		
		System.out.println("O maior valor digitado :" + valor);
	}

}
