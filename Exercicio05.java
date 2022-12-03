package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idComponent1, idComponent2, component1Quantity, component2Quantity;
		double unitValue1, unitValue2, payment;
		
		System.out.print("ID component: ");
		idComponent1 = sc.nextInt();
		System.out.print("Quantity: ");
		component1Quantity = sc.nextInt();
		System.out.print("Unit value: ");
		unitValue1 = sc.nextDouble();
		
		System.out.println();
		System.out.print("ID component: ");
		idComponent2 = sc.nextInt();
		System.out.print("Quantity: ");
		component2Quantity = sc.nextInt();
		System.out.print("Unit value: ");
		unitValue2 = sc.nextDouble();
		
		payment = component1Quantity * unitValue1 + component2Quantity * unitValue2;
		
		System.out.printf("Payment = U$ %.2f%n", payment);
		
		
		sc.close();
	}

}
