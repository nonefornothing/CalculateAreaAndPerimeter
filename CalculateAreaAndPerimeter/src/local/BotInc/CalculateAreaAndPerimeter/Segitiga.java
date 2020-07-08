package local.BotInc.CalculateAreaAndPerimeter;

public class Segitiga extends HitungBangun{

	public double alas,tinggi,sisi;
	
	public Segitiga (int sisi) {
		this.sisi = sisi;
	}
	
	public Segitiga (int alas,int tinggi) {
		this.alas = alas;
		this.tinggi = tinggi;
	}
	
	
	public double HitungLuas (){
		return  (0.5 * alas * tinggi);
	}
	
	public double HitungKeliling () {
		return  (3 * sisi);
	}
	
}
