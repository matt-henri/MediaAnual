package mediaAnual;

import java.util.Locale;
import java.util.Scanner;

import calculoDeNotas.media;

public class Resultado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		media emp = new media();
		
		System.out.print("Aluno: ");
		String nome = sc.nextLine();
		
		System.out.print("Nota do Primeiro Trimestre: ");
		emp.nota1 = sc.nextDouble();
		
		System.out.print("Nota do Segundo Trimestre: ");
		emp.nota2 = sc.nextDouble();
		
		System.out.print("Nota do Trimestre Trimestre: ");
		emp.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Media de Notas Anual de " + nome + " foi " + String.format("%.2f", emp.mediaAnual()));
		System.out.println();
		System.out.println("Grade Final de Notas Anual: " + String.format("%.2f", emp.gradeFinal()));
		
		
		sc.close();

	}

}
