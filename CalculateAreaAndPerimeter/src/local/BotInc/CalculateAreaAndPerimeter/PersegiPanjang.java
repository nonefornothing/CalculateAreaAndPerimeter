package local.BotInc.CalculateAreaAndPerimeter;

public class PersegiPanjang extends HitungBangun {

	public int panjang;
	public int lebar;
	
	public PersegiPanjang(int panjang,int lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	public double HitungLuas (){
		return (panjang * lebar);
	}
	
	public double HitungKeliling () {
		return 2 * (panjang + lebar);
	}
	
}
