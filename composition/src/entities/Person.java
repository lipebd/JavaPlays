package entities;

public class Person {

	public String name;
	public Integer age;
	Pet pet;
	
	public Person(String name, Integer age, Pet pet) {
		this.name = name;
		this.age = age;
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

	public void setAge(Integer age) {
		this.age = age;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
}
