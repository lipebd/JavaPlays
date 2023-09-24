package teste_processamento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int x, y, z;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos somar dois números!\n");
		
		System.out.println("Digite o primeiro número:");
		x = sc.nextInt();
		System.out.println("Digite o segundo número:");
		y = sc.nextInt();
		
		z = x + y;
		
		System.out.println("\nA soma " + z + " + " + y +" é igual a " + z);
		sc.close();				
	}

}
