package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// Atributos
		double largura;
		double comprimento;
		double area;
		double preco;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite a largura do terreno: ");
		System.out.println("Digite o comprimento do terreno: ");
		System.out.println("Digite o preço por metro quadrado: ");
		largura = entrada.nextDouble();
		comprimento = entrada.nextDouble();
		preco = entrada.nextDouble();
		area = largura * comprimento;
		preco = preco * area;
		entrada.close();
		System.out.println("O preço do terreno é : " + preco);

	}

}
