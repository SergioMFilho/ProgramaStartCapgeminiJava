package ProgramaStartCapgemini;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor:");
		int number = entrada.nextInt();
		if (number >10 && number <=200) {
			System.out.println("O número está entre o intervalo de 10 a 200");
		} else {
			System.out.println("O número não está entre os intervalos");
		}
	}
}
