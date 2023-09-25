package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {

	private String name;
	private Integer age;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	private void setAge() {
		age = Period.between(nascimento, hoje).getYears();
	}

	public String fim() {
		setAge();
		return String.format("%nCadastro realizado com sucesso.")
		+ String.format("%n-----------------------------------------%n")
		+ name
		+ ", "
		+ age
		+ " anos de idade, tutor(a) do "
		+ pet.toString()
		+ "."
		+ String.format("%n-----------------------------------------");
	}

	public String toString() {
		setAge();
		return "----------------------"
				+ String.format("%nNome: ")
				+ name
				+ String.format("%nData de nascimento: ")
				+ nascimento + String.format("%nDADOS DO PET")
				+ String.format("%nID: ")
				+ pet.getIdPet()
				+ String.format("%nTipo do animal: ")
				+ pet.getTipo()
				+ String.format("%nNome: ")
				+ pet.getPetName()
				+ String.format("%nData do registro: ")
				+ agora
				+ String.format("%n----------------------%n");
	}
}