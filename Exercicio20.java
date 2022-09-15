package ProgramaStartCapgemini;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		float valorCarro;
		float desconto;
		int anoFabricacao;
		int carrosVelhos = 0;
		int carrosNovos = 0;

		char desejaRepetir = 's';

		Scanner input = new Scanner(System.in);

		while (desejaRepetir == 's' || desejaRepetir == 'S') {
			System.out.println("Enter the value of the car:");
			valorCarro = Float.parseFloat(input.nextLine());

			System.out.println("Write the year of the car: ");
			anoFabricacao = Integer.parseInt(input.nextLine());

			if (anoFabricacao <= 2000) {
				desconto = 0.88f;
				System.out.println("O valor que deve ser pago é: " + valorCarro * desconto);
				carrosVelhos++;
			} else {
				desconto = 0.93f;
				System.out.println("O valor que deve ser pago é: " + valorCarro * desconto);
				carrosNovos++;
			}
			System.out.println("Deseja continuar?  S - Sim | N - Não ");
			desejaRepetir = input.nextLine().charAt(0);
		}
		System.out.println("Carros Novos: " + carrosNovos + "\nCarros Velhos: " + carrosVelhos);
	}
}
