package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the first number: ");
		int number_1 = sc.nextInt();
		System.out.print("enter the second number: ");
		int number_2 = sc.nextInt(); 
		
		int numberSum = number_1 + number_2;
		
		System.out.println("SUM = " + numberSum);
		
		sc.close();
	}

}
