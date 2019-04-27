package Ex2;

public class Livros extends Produto{
	
	protected String autor;
	
	Livros(String autor, String nome, float pre�o){
		super(nome,pre�o);
		this.autor=autor;
	}
		
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String toString() {
		return this.getAutor() + " "  + this.getNome() + " " + this.getPre�o();
	}
	
}
