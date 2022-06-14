package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class exercicio2_funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario fun = new Funcionario();
		
		System.out.println("name: ");
		fun.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		fun.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		fun.tax = sc.nextDouble();
		
		System.out.println("Employee: " + fun.toString());
		
		
		System.out.println("Which percenctage to increase Salary?");
		double per = sc.nextDouble();
		fun.increaseSalary(per);
		
		System.out.println("Updated data: " + fun.toString());
		sc.close();
	}

}
