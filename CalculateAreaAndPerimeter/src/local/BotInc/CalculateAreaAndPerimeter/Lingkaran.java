package local.BotInc.CalculateAreaAndPerimeter;

public class Lingkaran extends HitungBangun {
	
	public int jariJari;
	
	public Lingkaran(int jariJari) {
		this.jariJari = jariJari;
	}
	
	public double HitungLuas (){
		return (phi * jariJari * jariJari);
	}
	
	public double HitungKeliling()  {
		return (2 * phi * jariJari);
	}
	
}
