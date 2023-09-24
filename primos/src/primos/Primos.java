package primos;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Número a checar: ");
		int num = sc.nextInt();
		sc.close();
		boolean primo = true;
		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				primo = false;
			}
		}
		if (primo) {
			System.out.println("Sim, " + num + " é primo.");
		}
		else {
			System.out.println("Não, " + num + " não é primo.");
		}
	}
}
