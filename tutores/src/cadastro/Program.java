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
		List<Person> tutores = new ArrayList<>();
		System.out.println("CADASTRO DE PETS E TUTORES");
		pulaLinha(1);
		System.out.print("Quantos tutores serão cadastrados? ");
		int x = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < x; i++) {
			pulaLinha(1);
			System.out.println("TUTOR #" + (i + 1) + "/" + x);
			System.out.print("Nome completo do tutor: ");
			String tutor = sc.nextLine();
			System.out.print("Data de nascimento (dd/mm/aaaa): ");
			String nascimento = sc.nextLine();
			System.out.println("Tipo do pet");
			System.out.print("[1] Pássaro, [2] Cachorro, [3] Gato: ");
			int tipo = 0;
			Pet pet = new Pet();
			while (tipo < 1 || tipo > 3) {
				tipo = sc.nextInt();
				if (tipo == 1) {
					pet.setTipo(TipoPet.BIRD);
				} else if (tipo == 2) {
					pet.setTipo(TipoPet.DOG);
				} else if (tipo == 3) {
					pet.setTipo(TipoPet.CAT);
				} else {
					pulaLinha(1);
					System.out.println("Insira um tipo válido!");
					System.out.print("[1] Pássaro, [2] Cachorro, [3] Gato: ");
				}
			}
			pulaLinha(1);
			System.out.println("Cadastrando novo " + pet.getTipo());
			System.out.print("Nome do pet: ");
			String petName = sc.next();
			System.out.print("ID do pet: ");
			int idPet = sc.nextInt();
			sc.nextLine();
			pet.setPetName(petName);
			pet.setIdPet(idPet);
			tutores.add(new Person(tutor, nascimento, pet));
			pulaLinha(1);
			System.out.println("Cadastro realizado com sucesso.");
			System.out.printf("-----------------------------------------%n");
		}
		pulaLinha(1);
		System.out.println("Registro Final:");
		for (Person tutor : tutores) {
			System.out.println(tutor);
		}
		sc.close();
	}
	private static void pulaLinha(int n) {
		for (int i = 0; i < n; i++)
		System.out.println();
		}
	}


