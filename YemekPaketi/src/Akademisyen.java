
public class Akademisyen extends insan { // İs-a İliskisi hiyerarsik

	String Bransı;
	int akademisyenSayac = 0;

	Akademisyen() {
		System.out.println("Akademisyen sinifindan nesne olusturuldu");
		akademisyenSayac++;
	}

	Akademisyen(String isim) { // constructor ile nesneye ilk girisleri yapar


		System.out.println("Akademisyen nesnesi yaratildi ismi: " + isim);
		akademisyenSayac++;
	}

	Akademisyen(String isim, String Bransi) {
		// constructor ile nesneye ilk girisleri yapar
		System.out.println("Akademisyen nesnesi yaratildi ismi: " + isim + " Bransi ise " + Bransi);
		akademisyenSayac++;
	}

	@Override // bilgileri verir - Override
	void insanBilgileri() {

		System.out.println(isim + " " + soyad + " " + Bransı);
	}

	static void yemekListesi() { // Override - yemek listesi
		System.out.println("Adi Yemek1 fiyati = " + Yemek1 + "\n" + "Adi Yemek2 fiyati = " + Yemek2 + "\n"
				+ "Adi Yemek3 fiyati = " + Yemek3 + "\n" + "Adi Yemek4 fiyati = " + Yemek4 + "\n" + " fiyati = ");
	}

}


