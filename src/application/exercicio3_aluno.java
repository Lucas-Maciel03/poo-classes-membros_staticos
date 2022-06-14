package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class exercicio3_aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Nome: ");
		aluno.name =sc.nextLine();
		System.out.println("Notas: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Final Grade = %.2f%n", aluno.somaNota());
		
		if(aluno.somaNota() < 60.0) {
			System.out.println("Failed");
			System.out.printf("Missing %.2f Points%n", aluno.result());
		} else {
			System.out.println("Pass");
		}
		sc.close();
	}

}
