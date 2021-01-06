package EstruturasRepetitivas;

import java.util.Scanner;

public class DebugnoEclipse {

	public static void main(String[] args) {
		        
		
		        // Debug usando o Run -  Toggle Breakpoint
		
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


