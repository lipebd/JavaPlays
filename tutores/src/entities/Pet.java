package entities;

import enums.TipoPet;

public class Pet {

	private TipoPet tipo;
	private String petName;
	private int idPet;
	
	public Pet() {
	}
	
	public Pet(TipoPet tipo) {
		this.tipo = tipo;
	}
	
	public TipoPet getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoPet tipo) {
		this.tipo = tipo;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public int getIdPet () {
		return idPet;
	}

	public void setIdPet (int idPet) {
		this.idPet = idPet;
	}
	
	public String toString() {
		return petName
				+ ", um " + tipo
				+ " de ID " + idPet;
	}
}
