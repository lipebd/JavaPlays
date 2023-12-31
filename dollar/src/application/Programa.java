package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Programa {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Conversão Dólar -> Real com IOF%");
	System.out.println();
	
	System.out.print("Cotação atual: ");
	double dolar = sc.nextDouble();
	System.out.print("Dólares comprados: ");
	double quantidade = sc.nextDouble();
	System.out.print("IOF% atual: ");
	double iof = sc.nextDouble();
	
	double conv = Calculator.convDolarReal(dolar, quantidade, iof);
	
	System.out.printf("Total a pagar: R$%.2f", conv);
	
	sc.close();

	}

}
