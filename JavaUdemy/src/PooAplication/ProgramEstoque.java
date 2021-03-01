package PooAplication;

import java.util.Scanner;

import PooEntities.Produto;

public class ProgramEstoque {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Digite os dados do Produto");
		System.out.println("Nome: ");
		produto.name= entrada.nextLine();
		System.out.println("Preco: ");
		produto.price = entrada.nextDouble();
		System.out.println("Quantidade: ");
		produto.quantity = entrada.nextInt();
		
		entrada.close();
		

	}

}
