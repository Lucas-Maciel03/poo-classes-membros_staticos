package entities;

public class Aluno {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double somaNota() {
		return nota1 + nota2 + nota3;
	}
	
	public double result() {
		if(somaNota() >= 60) {
			return 0;
		} else {
			return 60 - somaNota();
		}
	}
}
