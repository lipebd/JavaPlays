package cadastro;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Person;
import entities.Pet;
import entities.enums.TipoPet;
import operations.OpenList;
import operations.SaveList;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("GESTÃO DO PETSHOP DO LIPE");
		pulaLinha(1);
		System.out.println("Digite a operação desejada");
		System.out.print("[1] Cadastrar Manualmente, [2] Cadastrar de Arquivo .csv: ");
		int modo = sc.nextInt();
		pulaLinha(1);

		while (modo < 1 || modo > 2) {
			System.out.println("Operação inválida. Tente novamente");
			System.out.print("[1] Cadastrar Manualmente, [2] Cadastrar de Arquivo .csv: ");
			modo = sc.nextInt();
			pulaLinha(1);
		}

		if (modo == 1) {
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
				pulaLinha(1);

				System.out.println("Tipo do pet");
				int n = 0;
				while (n < 1 || n > 4) {

					System.out.print("[1] Pássaro, [2] Cachorro, [3] Gato, [4] Carneiro: ");
					n = sc.nextInt();
					sc.nextLine();
					pulaLinha(1);
					if (n < 1 || n > 4) {
						System.out.println("[" + n + "]" + " não é um tipo válido. Tente novamente.");
						pulaLinha(1);
					}
				}

				TipoPet tipo = Pet.setTipo(n);

				System.out.println("Cadastrando novo " + tipo);

				System.out.print("Nome do pet: ");
				String petName = sc.nextLine();

				System.out.print("Sexo (m/f): ");
				char gen = sc.next().charAt(0);

				System.out.print("ID do pet: ");
				int idPet = sc.nextInt();
				sc.nextLine();

				Person person = new Person(tutor, nascimento, new Pet(tipo, petName, gen, idPet), LocalDateTime.now());
				tutores.add(person);

				System.out.println(person.fim());
			}

			pulaLinha(1);
			System.out.print("Deseja salvar a informação em um arquivo (s/n)? ");
			char sn;
			do {
				sn = sc.next().charAt(0);
			} while (sn != 's' && sn != 'n');
			SaveList.writeRecords(tutores, sn);
		} else if (modo == 2) {
						
			System.out.println("CADASTRO VIA RELATÓRIO CSV");
			pulaLinha(1);
			System.out.println("Coloque o arquivo desejado na pasta /relatórios/in/");
			System.out.print("Digite o nome do arquivo, sem a extensão: ");
			String arquivo = sc.next();
			pulaLinha(1);
			
			OpenList.readRecords(arquivo);
			OpenList.printLista();
			pulaLinha(1);
			System.out.print("Deseja salvar a informação em um arquivo (s/n)? ");
			char sn;
			do {
				sn = sc.next().charAt(0);
			} while (sn != 's' && sn != 'n');
			OpenList.writeRecords(sn);
			
			
		} else {
			System.out.println("Erro inesperado.");
		}
		pulaLinha(1);
		System.out.println("Obrigado. Até logo.");
		sc.close();
	}

	private static void pulaLinha(int n) {
		for (int i = 0; i < n; i++)
			System.out.println();
	}
}
