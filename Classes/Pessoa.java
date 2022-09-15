package ProgramaStartCapgemini.Classes;

public class Pessoa {

	// Attributes
	private float peso;
	private float altura;
	
	public Pessoa() {     // Creating constructor
		System.out.println("Running the constructor");
	}

	public float calcularIMC() {
		float imc = peso / (altura * altura);
		return imc;
	}
	
	// Accessor methods
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getAltura() {
		return altura;
	}
}



