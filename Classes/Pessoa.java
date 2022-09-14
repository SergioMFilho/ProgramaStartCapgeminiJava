package ProgramaStartCapgemini.Classes;

public class Pessoa {

	// Attributes
	float peso;
	float altura;
	String nome;

	public float calcularIMC() {
		float imc = peso / (altura * altura);
		return imc;
	}

	public String correr() {
		return nome + " esta correndo";
	}
}
