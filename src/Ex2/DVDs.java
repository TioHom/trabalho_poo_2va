package Ex2;

public class DVDs extends Produto{

	protected float dura��o;	
	
	DVDs(float dura��o, String nome, float pre�o) {
		
		super(nome,pre�o);
		this.dura��o = dura��o;
		
	}
	public float getDura��o() {
		return dura��o;
	}
	public void setDura��o(float dura��o) {
		this.dura��o = dura��o;
	}
	
	public String toString() {
		return this.getNome() + " " + this.getDura��o() + " " + this.getPre�o();
	}
	
}
