package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class membros_staticos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double dollarQtd = sc.nextDouble();
		
		double finalValue = CurrencyConverter.conversor(dollarPrice, dollarQtd);
		System.out.printf("Amount to be paid in reais = %.2f%n", finalValue);
		
		sc.close();
	}

}
