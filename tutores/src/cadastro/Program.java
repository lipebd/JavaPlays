package cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Person;
import entities.Pet;
import enums.TipoPet;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Person> list = new ArrayList<>();

		System.out.println("CADASTRO DE TUTORES");
		System.out.println();

		System.out.print("Quantos tutores serão cadastrados? ");
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {

			System.out.println("TUTOR #" + (i + 1) + "/" + x);
			System.out.print("Nome completo do tutor: ");
			sc.nextLine();
			String tutor = sc.nextLine();

			System.out.print("Idade do tutor: ");
			int idade = sc.nextInt();

			System.out.println("Tipo do pet");
			System.out.print("[1] Pássaro, [2] Cachorro, [3] Gato: ");
			int tipo = 0;

			Pet pet = new Pet();

			while (tipo != 1 && tipo != 2 && tipo != 3) {
				tipo = sc.nextInt();
				if (tipo == 1) {
					pet.setTipo(TipoPet.BIRD);
				} else if (tipo == 2) {
					pet.setTipo(TipoPet.DOG);
				} else if (tipo == 3) {
					pet.setTipo(TipoPet.CAT);
				} else {System.out.println("Insira um tipo válido");
					System.out.print("[1] Pássaro, [2] Cachorro, [3] Gato: ");
				}
			}
			System.out.println();
			System.out.print("Nome do pet: ");
			String petName = sc.next();
			System.out.print("ID do pet: ");
			int idPet = sc.nextInt();

			pet.setPetName(petName);
			pet.setIdPet(idPet);
			Person fulano = new Person(tutor, idade, pet);
			list.add(fulano);
			System.out.println();
		}

		System.out.println("Registro Final:");
		for (Person fulano : list) {
			System.out.println(fulano);
		}

		sc.close();
	}

}
