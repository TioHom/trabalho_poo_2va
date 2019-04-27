package Ex2;

public class DVDs extends Produto{

	protected float duração;	
	
	DVDs(float duração, String nome, float preço) {
		
		super(nome,preço);
		this.duração = duração;
		
	}
	public float getDuração() {
		return duração;
	}
	public void setDuração(float duração) {
		this.duração = duração;
	}
	
	public String toString() {
		return this.getNome() + " " + this.getDuração() + " " + this.getPreço();
	}
	
}
