package calculoDeNotas;

public class media {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public double mediaAnual() {
		return (nota1 + nota2 + nota3) / 3;
	}
	
	public String toString() {
		return "A média anul de notas de " + nome + " foi de " + mediaAnual();
	}

}
