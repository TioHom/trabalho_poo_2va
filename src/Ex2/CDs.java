package Ex2;

public class CDs extends Produto {
	
	protected int n�merosdefaixas;	
	
	CDs(int n�merosdefaixas, String nome, float pre�o){
		super(nome,pre�o);
		this.n�merosdefaixas=n�merosdefaixas;
	}
	
	public int getN�merosdefaixas() {
		return n�merosdefaixas;
	}
	public void setN�merosdefaixas(int n�merosdefaixas) {
		this.n�merosdefaixas = n�merosdefaixas;
	}
	
	public String toString() {
		return this.getNome() + " "  + this.getN�merosdefaixas()+ " " + this.getPre�o();
	}
	
}
