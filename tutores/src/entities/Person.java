package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {

	private String name;
	private LocalDate nascimento;
	private LocalDateTime agora;
	Pet pet;
	static LocalDate hoje = LocalDate.now();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Person(String name, String nascim, Pet pet, LocalDateTime agora) {
		this.name = name;
		this.nascimento = LocalDate.parse(nascim, dtf);
		this.pet = pet;
		this.agora = agora;
	}

	public Person(String name, String nascim, LocalDateTime agora) {
		this.name = name;
		this.nascimento = LocalDate.parse(nascim, dtf);
		this.agora = agora;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return Period.between(nascimento, hoje).getYears();
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public String fim() {
		String pronome;
		if (pet.getGender() == 'm') {
			pronome = "do";
		} else {
			pronome = "da";
		}
		return String.format("%nCadastro realizado com sucesso.")
				+ String.format("%n-----------------------------------------%n") + name + ", " + getAge()
				+ " anos de idade, tutor " + pronome + " " + pet.toString() + "."
				+ String.format("%n-----------------------------------------");
	}

	public String toString() {
		return "----------------------" + String.format("%nNome: ") + name + String.format("%nData de nascimento: ")
				+ nascimento + " (" + getAge() + " anos)" + String.format("%nDADOS DO PET") + String.format("%nID: ")
				+ pet.getIdPet() + String.format("%nTipo do animal: ") + pet.getTipo() + " (" + pet.getGender() + ") "+ String.format("%nNome: ")
				+ pet.getPetName() + String.format("%nData do registro: ") + agora
				+ String.format("%n----------------------%n");
	}
}