package ProgramaStartCapgemini;

import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		
		int totalAlunos = 5;
		
		Scanner entrada = new Scanner(System.in);
		
		while(totalAlunos > 0) {
			String nomeAluno = entrada.nextLine();
			int idadeAluno = Integer.parseInt(entrada.nextLine());
			
		System.out.println("O nome do aluno é "+ nomeAluno + " e sua idade é : " + idadeAluno);
		
		totalAlunos = totalAlunos-1;
		}
	}
}
