package ProgramaStartCapgemini;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nomeProduto;
		float precoCusto;
		float precoVenda;
		
		float totalCusto = 0.0f;
		float totalVenda = 0.0f;

		int i = 0;
		for (; i < 3; i++) {
			System.out.println("Informe o nome do produto");
			nomeProduto = entrada.nextLine();
			System.out.println("Informe o preço de custo do produto");
			precoCusto = Float.parseFloat(entrada.nextLine());
			System.out.println("Informe de venda do produto");
			precoVenda = Float.parseFloat(entrada.nextLine());

			totalCusto = totalCusto + precoCusto;
			totalVenda = totalVenda + precoVenda;
			
			if (precoVenda > precoCusto) {
				System.out.println("Lucro");
			} else {
				if (precoVenda == precoCusto) {
					System.out.println("Empate");
				} else {
					System.out.println("Prejuízo");
				}
			}
			System.out.println(nomeProduto + " Preço de custo = " + precoCusto + " \npreco de venda = " + precoVenda);
		}
		System.out.println(" A media do preço do custo é de : " + (totalCusto/i));
		System.out.println(" A media do preço de venda é de : " + (totalVenda/i));
		
	}
}
