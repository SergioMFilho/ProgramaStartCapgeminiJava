package ProgramaStartCapgemini.Classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Pessoa objetoPessoa = new Pessoa();

		Scanner input = new Scanner(System.in);

		objetoPessoa.nome = input.nextLine();
		System.out.println("Digite o peso da pessoa");
		objetoPessoa.peso = Float.parseFloat(input.nextLine());
		System.out.println("Digite a altura da pessoa");
		objetoPessoa.altura = Float.parseFloat(input.nextLine());

		System.out.println("IMC = " + objetoPessoa.calcularIMC());

		System.out.println(objetoPessoa.correr());
	}
}
