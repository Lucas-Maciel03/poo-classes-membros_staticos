package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double conversor(double price, double qtd) {
		return price * qtd * (1 + IOF);
	}
}
