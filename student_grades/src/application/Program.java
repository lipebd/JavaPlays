package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("SITUAÇÃO DO ESTUDANTE");
		System.out.println();
		
		System.out.print("Nome do Estudante: ");
		student.name = sc.nextLine();
		System.out.println();
		
		System.out.print("Nota da A1: ");
		student.grade1 = sc.nextDouble();
		System.out.println();
		
		System.out.print("Nota da A2: ");		
		student.grade2 = sc.nextDouble();
		System.out.println();
		
		System.out.print("Nota da A3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf(student.toString());
		
		sc.close();
	}
}