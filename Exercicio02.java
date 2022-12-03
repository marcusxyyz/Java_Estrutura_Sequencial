package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		System.out.print("Inform the radius: ");
		double radius = sc.nextDouble();
		
		double area = pi * Math.pow(radius, 2);
		
		System.out.printf("Area = %.4f%n", area);
		
		sc.close();
	}

}
