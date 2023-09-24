package enums;

public enum TipoPet {
	
	TIPO,
	DOG,
	CAT,
	BIRD;	
	
	public String toString() {
		switch (this) {
		case DOG:
			return "cachorro";
		case CAT:
			return "gato";
		case BIRD:
			return "pássaro";
		default:
			return null;
		}
	}
}
