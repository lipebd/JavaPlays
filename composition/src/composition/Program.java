package composition;

import java.util.Scanner;

import entities.Person;
import entities.Pet;
import enums.TipoPet;

public class Program {

	public static void main(String[] args) {

		System.out.println("CADASTRO DE TUTORES");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.print("Nome completo do tutor: ");
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
			} else
				System.out.println("Insira um tipo válido");
		}
		System.out.println();
		System.out.print("Nome do pet: ");
		String petName = sc.next();
		pet.setPetName(petName);
		
		System.out.print("ID do pet: ");
		int idPet = sc.nextInt();
		pet.setIdPet(idPet);
		
		Person fulano = new Person(tutor, idade, pet);
		
		System.out.println();
		System.out.println("Registro final: " + fulano.getName() + ", " + fulano.getAge()
				+ " anos de idade, tutor do " + fulano.getPet().getTipo() + " " + fulano.getPet().getPetName() + ", de ID " + fulano.getPet().getIdPet());
		
		sc.close();
	}

}
