package Ex2;

public class Livros extends Produto{
	
	protected String autor;
	
	Livros(String autor, String nome, float preço){
		super(nome,preço);
		this.autor=autor;
	}
		
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String toString() {
		return this.getAutor() + " "  + this.getNome() + " " + this.getPreço();
	}
	
}
