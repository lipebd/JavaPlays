package entities;

import entities.enums.TipoPet;

public class Pet {

	private TipoPet tipo;
	private String petName;
	private int idPet;
	private char gen;

	public Pet(TipoPet tipo, String petName, char gen, int idPet) {
		this.tipo = tipo;
		this.petName = petName;
		this.gen = gen;
		this.idPet = idPet;
	}

	public TipoPet getTipo() {
		return tipo;
	}

	public void setTipo(TipoPet tipo) {
		this.tipo = tipo;
	}

	public static TipoPet setTipo(int n) {
		if (n == 1) {
			return TipoPet.BIRD;
		} else if (n == 2) {
			return TipoPet.DOG;
		} else if (n == 3) {
			return TipoPet.CAT;
		} else if (n == 4) {
			return TipoPet.SHEEP;
		}
		return null;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getIdPet() {
		return idPet;
	}
	
	public char getGender() {
		return gen;
	}

	public void setIdPet(int idPet) {
		this.idPet = idPet;
	}

	public String toString() {
		return petName + ", um " + tipo.toString() + " (" + gen + ") de ID " + idPet;
		}
}
