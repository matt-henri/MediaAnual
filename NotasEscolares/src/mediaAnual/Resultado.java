package mediaAnual;

import java.util.Scanner;

import calculoDeNotas.media;

public class Resultado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		media mediaFinal = new media();
		
		System.out.print("Aluno: ");
		String nome = sc.nextLine();
		
		System.out.print("Nota do Primeiro Trimestre: ");
		int nota1 = sc.nextInt();
		
		System.out.print("Nota do Segundo Trimestre: ");
		int nota2 = sc.nextInt();
		
		System.out.print("Nota do Trimestre Trimestre: ");
		int nota3 = sc.nextInt();
		
		System.out.println(mediaFinal);
		
		
		
		sc.close();

	}

}
