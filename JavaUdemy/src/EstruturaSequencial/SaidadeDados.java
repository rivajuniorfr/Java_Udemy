package EstruturaSequencial;

import java.util.Scanner;

public class SaidadeDados {

	public static void main(String[] args) {

		double x = 12.345667;

		// imprimindo com 2 e com 4 casas decimais
		System.out.printf("%.2f%n", x);
		System.out.printf("O resultado é: " + "%.4f Reais%n", x);
		System.out.printf("O resultado é: " + "%.2f Euros%n", x);

		// Imprimindo com Marcadores

		String nome = "Maria";
		int idade = 23;
		double salario = 4.500;

		System.out.printf("%s tem %d anos e ganha R$ %.3f Reais%n", nome, idade, salario);

		// Casting

		int a, b;
		double resultado;

		a = 5;
		b = 2;
		resultado = (double) a / b;
		System.out.println(resultado);

		double c;
		int d;
		c = 5.0;
		d = (int) c;
		System.out.println(d);

		// Entrada de dados com Scanner

		String e;
		char f;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a palavra");
		e = entrada.nextLine();
		System.out.println(e);
		System.out.println();
		System.out.println("Digite a  segunda palavra");
		f = entrada.next().charAt(0);
		System.out.println(f);
		System.out.println();
		System.out.println();
		entrada.close();
		
		// Funções Matemáticas
		
		double g = 3.0;
		double h = 4.0;
		double i = 5.0;
		double j,l,m;
		
		// Raiz quadrada
		j = Math.sqrt(g) ;
		l = Math.sqrt(h) ;
		m = Math.sqrt(i);
		System.out.println("A raiz quadrade de 3 é :" + j);
		System.out.println("A raiz quadrade de 4 é :" + l);
		System.out.println("A raiz quadrade de 5 é :" + m);
		// Numero elevado ao outro
		j = Math.pow(g,h) ;
		l = Math.pow(h,g) ;
		m = Math.pow(i,g);
		System.out.println("3 elevado a 4 é :" + j);
		System.out.println("4 elevado a 3 é :" + l);
		System.out.println("5 elevado a 3 é :" + m);
		
		
	}

}
