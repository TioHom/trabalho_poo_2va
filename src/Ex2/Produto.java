package Ex2;

public class Produto {
	
	protected String nome;
	protected float pre�o;
	
	Produto(String nome, float pre�o) {
		this.nome = nome;
		this.pre�o = pre�o;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getPre�o() {
		return pre�o;
	}
	
	public void setPre�o(float pre�o) {
		this.pre�o = pre�o;
	}	

}
