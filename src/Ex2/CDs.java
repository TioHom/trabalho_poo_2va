package Ex2;

public class CDs extends Produto {
	
	protected int númerosdefaixas;	
	
	CDs(int númerosdefaixas, String nome, float preço){
		super(nome,preço);
		this.númerosdefaixas=númerosdefaixas;
	}
	
	public int getNúmerosdefaixas() {
		return númerosdefaixas;
	}
	public void setNúmerosdefaixas(int númerosdefaixas) {
		this.númerosdefaixas = númerosdefaixas;
	}
	
	public String toString() {
		return this.getNome() + " "  + this.getNúmerosdefaixas()+ " " + this.getPreço();
	}
	
}
