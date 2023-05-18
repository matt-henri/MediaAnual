package calculoDeNotas;

public class media {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	
	public double mediaAnual() {
		return (nota1 + nota2 + nota3) / 3;
	}
	
	public double gradeFinal() {
		return nota1 + nota2 + nota3;
	}
	
	
	public double aprovStatus() {
		if (gradeFinal() < 60) {
			return 60.0 - gradeFinal();
		} else {
			return 0.0;
		}
	}
	
	
}
