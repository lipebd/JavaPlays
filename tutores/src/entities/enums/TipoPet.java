package entities.enums;

public enum TipoPet {

	DOG, CAT, BIRD, SHEEP;

	public String toString() {
		switch (this) {
		case DOG:
			return "cachorro";
		case CAT:
			return "gato";
		case BIRD:
			return "pássaro";
		case SHEEP:
			return "carneiro";
		default:
			return null;
		}
	}

	TipoPet parseTipoPet(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
