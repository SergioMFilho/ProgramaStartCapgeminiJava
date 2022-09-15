package ProgramaStartCapgemini.Classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Pessoa objetoPessoa = new Pessoa();
		Scanner input = new Scanner(System.in);
		//
		
		System.out.println("Digite o peso da pessoa");
		objetoPessoa.setPeso(Float.parseFloat(input.nextLine()));
		
		System.out.println("Digite a altura da pessoa");
		objetoPessoa.setAltura(Float.parseFloat(input.nextLine()));

		System.out.println("IMC = " + objetoPessoa.calcularIMC());

	}
}
