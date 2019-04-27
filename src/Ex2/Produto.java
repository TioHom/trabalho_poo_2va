package Ex2;

public class Produto {
	
	protected String nome;
	protected float preço;
	
	Produto(String nome, float preço) {
		this.nome = nome;
		this.preço = preço;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getPreço() {
		return preço;
	}
	
	public void setPreço(float preço) {
		this.preço = preço;
	}	

}
