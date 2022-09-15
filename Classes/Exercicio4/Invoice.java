package ProgramaStartCapgemini.Classes.Exercicio4;

public class Invoice {

	private int numeroItem;
	private String descricao;
	private int quantidade;
	private float precoUnitario;
	
	public Invoice(int numeroItem, String descricao, int quantidade, float precoUnitario) {
		this.setNumeroItem(numeroItem);
		this.setDescricao(descricao);
		this.setQuantidade(quantidade);
		this.setPrecoUnitario(precoUnitario);
	}

	public double getInvoiceAmount () {
		return quantidade * precoUnitario;	
	}
	 
	public int getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if(quantidade < 0) {
			this.quantidade = 0;
		} else {
			this.quantidade = quantidade;
		}
		
	}

	public float getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(float precoUnitario) {
		if(precoUnitario < 0) {
			this.precoUnitario = 0.0f;
		} else {
			this.precoUnitario = precoUnitario;
		}
	}
}
