
public class Ogrenci extends insan { // // İs-a İliskisi hiyerarsik

	int no;
	int Ogrencisayac = 0;
	int disiplinPuani = 0;
	int agirCeza;
	int sinif;

	Ogrenci() { // Constructor sadece bilgi veriyor
		System.out.println("Ogrenci sinifindan nesne yaratilmistir");
		Ogrencisayac++;
	}

	Ogrenci(String isim) { // Parametreli Constructor - overloading
		this.isim = isim;
		System.out.println("Ogrenci sinifindan nesne yaratilmistir");
		Ogrencisayac++;

	}

	Ogrenci(String isim, String soyad) { // Parametreli Constructor - overloading

		this.isim = isim;
		this.soyad = soyad;
		System.out.println("Ogrenci sinifindan nesne yaratilmistir ismi: " + isim + " " + soyad);
		Ogrencisayac++;

	}

	void ogrenciBilgiler() { // Ogrencinin bilgilerini veriyor
		System.out.println("Ogrencinin ismi : " + isim + " " + soyad + " numarasi ise" + " " + no);
	}

	@Override // miras aldigi siniftaki classtan override edildi
	void insanBilgileri() {
		System.out.println(isim + " " + soyad + "- disiplin puani = " + disiplinPuani);
	}

	void kacOgrenciVar() { // kac ogrenci oldugunu soyler
		System.out.println("Ogrenci sayisi = " + Ogrencisayac);
	}

	void Senesi() { // Ogrencinin sınıf senesini verir
		System.out.println("Ogrenci " + sinif + "." + " sinifta");
	}

	public static void yemekListesi() { // Override - yemek listesi
		System.out.println("Adi Yemek1 fiyati = " + Yemek1 + "\n" + "Adi Yemek2 fiyati = " + Yemek2 + "\n"
				+ "Adi Yemek3 fiyati = " + Yemek3 + "\n" + "Adi Yemek4 fiyati = " + Yemek4 + "\n" + "Adi OgrenciOzel = "
				+ OgrenciOzel + "\n");
	}

}
