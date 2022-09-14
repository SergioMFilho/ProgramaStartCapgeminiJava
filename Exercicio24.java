package ProgramaStartCapgemini;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		char desejaContinuar = 'S';
		
		while(desejaContinuar == 'S' || desejaContinuar == 's') {
			
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		int number1 = entrada.nextInt();
		if (number1 == 0) {
			System.out.println("O número é 0");
		} else {
			if (number1 > 0 ) {
				System.out.println("Número maior que zero");
			} else {
				System.out.println("Número negativo");
			}
		}
		System.out.println("Deseja Continuar?");
		desejaContinuar = entrada.next().charAt(0);
		}
	}
}
