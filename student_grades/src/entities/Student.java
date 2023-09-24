package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public double missingPoints() {
		if (finalGrade() < 70.0) {
			return 70.0 - finalGrade();
		} else {
			return 0.0;
		}
	}
	
	public String toString() {
		if (finalGrade() < 70.0) {
			return "REPROVADO%n"
				+ "FALTA(M) "
				+ String.format("%.2f", missingPoints())
				+ " PONTO(S)";
		} else {
			return "APROVADO";
		}
	}
}