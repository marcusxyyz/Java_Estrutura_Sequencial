package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double a, b, c, triangleRectangle, circle, trapezium, square, rectangle;
		
		System.out.print("Enter A value: ");
		a = sc.nextDouble();
		System.out.print("Enter B value: ");
		b = sc.nextDouble();
		System.out.print("Enter C value: ");
		c = sc.nextDouble();
		
		triangleRectangle = a * c / 2.0;
		circle = pi * Math.pow(c, 2);
		trapezium = ((a + b) * c) / 2.0;
		square = Math.pow(b, 2.0);
		rectangle = a * b;
		
		System.out.println();		
		System.out.printf("TRIANGLE: %.3f%n", triangleRectangle);
		System.out.printf("CIRCLE: %.3f%n", circle);
		System.out.printf("TRAPEZIUM: %.3f%n", trapezium);
		System.out.printf("SQUARE: %.3f%n", square);
		System.out.printf("RECTANGLE: %.3f%n", rectangle);
		
		
		sc.close();
	}

}
