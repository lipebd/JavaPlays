package util;

public class Calculator {
	
	public static double convDolarReal(double dolar, double quantidade, double iof) {
		double noTax = dolar * quantidade;
		return noTax += noTax * iof / 100;
	}
	
}
