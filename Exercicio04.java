package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, hoursWorked;
		double hourlyWage, salary;
		
		System.out.print("Number: ");
		number = sc.nextInt();
		System.out.print("Hours Worked: ");
		hoursWorked = sc.nextInt();
		System.out.print("Hourly wage: ");
		hourlyWage = sc.nextDouble();
		
		salary = hoursWorked * hourlyWage;
		
		System.out.println("Number " + number);
		System.out.printf("Salary = U$ %.2f%n", salary);
		
		
		sc.close();
	}

}
