
public class Idare extends insan { // İs-a İliskisi hiyerarsik

	int idareciSayisi = 0;

	Idare() { // Constructor sadece bilgi veriyor
		System.out.println("Idare sinifindan nesne yaratilmistir");
		idareciSayisi++;
	}

	Idare(String isim) { // Parametreli Constructor - overloading
		this.isim = isim;
		System.out.println("Idare sinifindan nesne yaratilmistir");
		idareciSayisi++;

	}

	Idare(String isim, String soyad) { // Parametreli Constructor - overloading
		this.isim = isim;
		this.soyad = soyad;
		System.out.println("Idare sinifindan nesne yaratilmistir");
		idareciSayisi++;

	}

	@Override // bilgileri verir
	void insanBilgileri() {
		System.out.println("Idareci: " + isim + " " + soyad);
	}

	void idareciSayisi() { // Kac ıdareci var onu ogreniriz
		System.out.println("Idareci sayisi " + idareciSayisi);
	}

	public void yemekKartiVer() {
		// TODO Auto-generated method stub
		
	}

}


