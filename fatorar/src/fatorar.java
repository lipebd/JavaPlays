import java.util.Scanner;

public class fatorar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Número a fatorar: ");
		int n = sc.nextInt();
		System.out.println();
		
		System.out.print("Exibir as etapas (s/n)? ");
		char exibe = sc.next().charAt(0);
		System.out.println();
		
		int resultado = n;
		int etapa = 1;
		
		while (n > 1) {
			if (exibe == 's') {
			System.out.print("Etapa " + etapa + ": " + resultado + " * " + (n-1) + " = ");
			resultado *= (n-1);
			System.out.println(resultado);
			etapa++;
			}
			else resultado *= (n-1);
			n--;
		}
	
		System.out.println("O resultado é: " + resultado);
		sc.close();
	}
}