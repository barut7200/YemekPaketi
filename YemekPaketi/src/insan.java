
public class insan extends YemekKarti { // is-a iliskisi

	String isim;
	String soyad;
	float boy;
	float yas;
	int gozrengi;
	float kilo;
	private int insanSayac = 0;

	// constructor
	insan() {
		insanSayac++;
	}

	// bilgileri verir
	void insanBilgileri() {
		System.out.println(isim + " " + soyad);
	}

	// kac insan oldugunu soyler
	void kacİnsanVar() {
		System.out.println("Insan Sayisi = " + insanSayac);
	}
}


