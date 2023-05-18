package mediaAnual;

import java.util.Locale;
import java.util.Scanner;

import calculoDeNotas.media;

public class Resultado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		media student = new media();
		
		System.out.print("Aluno: ");
		String nome = sc.nextLine();
		
		System.out.print("Nota do Primeiro Trimestre: ");
		student.nota1 = sc.nextDouble();
		
		System.out.print("Nota do Segundo Trimestre: ");
		student.nota2 = sc.nextDouble();
		
		System.out.print("Nota do Trimestre Trimestre: ");
		student.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Media de Notas Anual de " + nome + " foi " + String.format("%.2f", student.mediaAnual()));
		System.out.println();
		System.out.println("Grade Final de Notas Anual: " + String.format("%.2f", student.gradeFinal()));
		System.out.println();
		
		if (student.gradeFinal() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltou %.2f Pontos%n", student.aprovStatus());
		} else {
			System.out.println("Aprovado!!!");
		}
		
		
		
		
		sc.close();

	}

}
