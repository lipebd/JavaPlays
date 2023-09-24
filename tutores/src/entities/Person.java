package entities;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	private String name;
	private Integer age;
	private LocalDate nascimento;
	Pet pet;
	LocalDate hoje = LocalDate.now();
	
	public Person(String name, String nascim, Pet pet) {
		this.name = name;
		this.nascimento =  LocalDate.parse(nascim);
		this.pet = pet;
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
	
	public String toString() {
		setAge();
		return name
				+ ", "
				+ age + " anos de idade, tutor do "
				+ pet.toString()
				+".";
	}
}
