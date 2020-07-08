package local.BotInc.CalculateAreaAndPerimeter;

import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		do {
			
			System.out.println("Hitung Luas dan Keliling Bangun Datar");
			System.out.println("1. Persegi");
			System.out.println("2. Lingkaran");
			System.out.println("3. Persegi Panjang");
			System.out.println("4. Segitiga");
			System.out.println("5. Keluar");

			int pilihan = 0;

			System.out.println("Masukkan Pilihan");
			pilihan = AmbilInteger();

			// Persegi
			if (pilihan == 1) {

				pilihanFungsi();
				int x = AmbilInteger();
				
				if (x == 1) {
					System.out.println("Masukkan Nilai Sisi : ");
					int y = AmbilInteger();
					Persegi bangun = new Persegi(y);
					System.out.println(bangun.HitungLuas());
				} else if (x == 2) {
					System.out.println("Masukkan Nilai Sisi : ");
					int y = AmbilInteger();
					Persegi bangun = new Persegi(y);
					System.out.println(bangun.HitungKeliling());
				}

			} else if (pilihan == 2) {

				pilihanFungsi();
				int x = AmbilInteger();

				if (x == 1) {
					System.out.println("Masukkan Nilai jari jari : ");
					int jariJari = AmbilInteger();
					Lingkaran bangun = new Lingkaran(jariJari);
					System.out.println(bangun.HitungLuas());
				} else if (x == 2) {
					System.out.println("Masukkan Nilai Sisi : ");
					int jariJari = AmbilInteger();
					Lingkaran bangun = new Lingkaran(jariJari);
					System.out.println(bangun.HitungKeliling());
				}

			} else if (pilihan == 3) {

				pilihanFungsi();
				int x = AmbilInteger();

				if (x == 1) {
					System.out.println("Masukkan Nilai panjang : ");
					int panjang = AmbilInteger();
					System.out.println("Masukkan Nilai lebar : ");
					int lebar = AmbilInteger();
					PersegiPanjang bangun = new PersegiPanjang(panjang, lebar);
					System.out.println(bangun.HitungLuas());
				} else if (x == 2) {
					System.out.println("Masukkan Nilai panjang : ");
					int panjang = AmbilInteger();
					System.out.println("Masukkan Nilai lebar : ");
					int lebar = AmbilInteger();
					PersegiPanjang bangun = new PersegiPanjang(panjang, lebar);
					System.out.println(bangun.HitungKeliling());
				}
			} else if (pilihan == 4) {
				
				pilihanFungsi();
				int x = AmbilInteger();

				if (x == 1) {
					System.out.println("Masukkan Nilai Alas : ");
					int alas = AmbilInteger();
					System.out.println("Masukkan Nilai Tinggi : ");
					int tinggi = AmbilInteger();
					Segitiga bangun = new Segitiga(alas, tinggi);
					System.out.println(bangun.HitungLuas());
				} else if (x == 2) {
					System.out.println("Masukkan Sisi: ");
					int sisi = AmbilInteger();
					Segitiga bangun = new Segitiga(sisi);
					System.out.println(bangun.HitungKeliling());
				}
			}
			else if (pilihan == 5) {
				System.exit(0);
			}
			
		}while(true);
	}

	public static int AmbilInteger() {
		while (true) {
			try {
				return input.nextInt();
			} catch (Exception e) {
				input.next();
				System.err.println("Ketik bilangan integer !!!!");
			}
		}
	}

	public static void pilihanFungsi() {
		System.out.println("Masukkan Pilihan : ");
		System.out.println("1. Untuk menghitung Luas");
		System.out.println("2. Untuk menghitung Keliling");
	}
	
}
