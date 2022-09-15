package ProgramaStartCapgemini.Classes.Exercicio4;

public class Main {

	public static void main(String[] args) {
		
		Invoice inv = new Invoice(293,"Mouse Gamer",-1,100.00f);
		
		System.out.println("Valor total = " + inv.getInvoiceAmount());
	}
}
