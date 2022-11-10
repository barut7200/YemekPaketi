
public class Sinif { // has-a iliskisi kullaniyor

	int SiniftakiOgrenciSinifSayac = 0;
	int SiniftakiAkademisyenSayac = 0;

	Sinif() {
		System.out.println("Sinif nesnesi olusturuldu");
	}

	// has-a iliskisi ogrenci sinifindan nesnenin ismini yazdiriyor
	void ogrenciSinifaGit(Ogrenci ogrenci) {

		System.out.println("Ogrenci basariyla sinifa gitti " + ogrenci.isim);
		SiniftakiOgrenciSinifSayac++;
	}

	// Akademisyeni sinifa yollar has-a iliskisi
	void akademisyenSinifaGit(Akademisyen akademisyen) {
		System.out.println("Akademisyen basariyla sinifa gitti " + akademisyen.isim);
		SiniftakiAkademisyenSayac++;
	}

	void derseBasla() { // Derse baslama fonksiyonu eger ogretmen ogrenci yoksa baslamaz
		if (SiniftakiAkademisyenSayac >= 1 && SiniftakiOgrenciSinifSayac >= 1) {
			System.out.println("Ders basariyla baslayabilir");
		} else if (SiniftakiAkademisyenSayac <= 0) {
			System.out.println("Ogretmen olmadigi icin baslayamadi.");
		} else if (SiniftakiAkademisyenSayac <= 0 && SiniftakiOgrenciSinifSayac <= 0) {
			System.out.println("Ogretmen && ogrenci olmadigi icin baslayamadi.");
		} else {
			System.out.println("Hatali bir durum oldu");
		}
	}

	void derstenKov(Ogrenci ogrenci) { // has a iliskisi dersten kovmaya ve ogrencinin disiplin puanini arttirmaya
										// yarar
		if (ogrenci.disiplinPuani >= 3) {
			System.out.println("Agir bir disiplin cezasi verilecektir.");
			ogrenci.agirCeza++;
		} else if (ogrenci.agirCeza >= 2) {
			System.out.println("Ogrenci okuldan kovulacaktir");
		} else {
			System.out.println("Dersten basariyla kovdunuz " + ogrenci.isim);
			ogrenci.disiplinPuani++;
		}
	}
}


