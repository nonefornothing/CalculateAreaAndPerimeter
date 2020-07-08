package local.BotInc.CalculateAreaAndPerimeter;

public class Persegi extends HitungBangun {
	
	public Persegi(int sisi) {
		this.sisi = sisi;
	}

	public double HitungLuas(){
		return sisi * sisi;
	}

	public double HitungKeliling() {
		return 4 * sisi;
	}
	
}
