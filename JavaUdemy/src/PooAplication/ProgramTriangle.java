package PooAplication;

import java.util.Scanner;

import PooEntities.Triangle;

public class ProgramTriangle {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Triangle x,y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X : ");
		x.a = entrada.nextDouble();
		x.b = entrada.nextDouble();
		x.c = entrada.nextDouble();
		System.out.println("Enter the measures of triangle Y : ");
		y.a = entrada.nextDouble();
		y.b = entrada.nextDouble();
		y.c = entrada.nextDouble();
		
		double areaX= x.area();
		double areaY= y.area();
		
		
		
		System.out.printf("Triangle X area: %.4f%n" , areaX);
		System.out.printf("Triangle Y area: %.4f%n" , areaY);
				
		
		if (areaX > areaY) {
			
			System.out.println("Large area X");
		} 
		else {
			System.out.println("Large area Y");
		
		}
		entrada.close();

	}

}
