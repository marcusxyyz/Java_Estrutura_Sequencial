package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the value A: ");
		int a = sc.nextInt();
		System.out.print("Enter the value B: ");
		int b = sc.nextInt();
		System.out.print("Enter the value C: ");
		int c = sc.nextInt();
		System.out.print("Enter the value D: ");
		int d = sc.nextInt();
		
		int difference = a * b - c * d;
		
		System.out.println("Difference = " + difference);
		
		
		sc.close();
	}

}
