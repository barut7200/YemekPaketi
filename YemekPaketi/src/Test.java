
public class Test {

	public static void main(String[] args) {

		Ogrenci o1 = new Ogrenci(); // constructor Overloading - is-a iliskisi
		Ogrenci o2 = new Ogrenci("Osman", "Ata"); // constructor Overloading - insani miras aliyor

		Akademisyen akademisyen1 = new Akademisyen(); // Akademisyen sinifindan olusan nesne insani miras aliyor
		Akademisyen akademisyen2 = new Akademisyen("Ahmet"); // constructor Overloading

		Idare idare1 = new Idare(); // Akademisyen sinifindan olusan nesne insani miras aliyor
		Idare idare2 = new Idare("Hakan"); // constructor Overloading

		Sinif edebiyat = new Sinif(); // miras almıyor vermiyor has-a iliskisi kuruyor sadece

		o1.isim = "Osman"; // isim atamalari
		o1.soyad = "Ata"; // isim atamalari

		akademisyen1.isim = "Huseyin"; // isim atamalari
		akademisyen1.soyad = "Ahmetoglu"; // isim atamalari
		akademisyen1.Bransı = "OOP "; // isim atamalari

		idare1.isim = "Kara"; // isim atamalari
		idare1.soyad = "Murat"; // isim atamalari

		o1.insanBilgileri(); // Miras aldigi siniftan Overriding yapiyor
		akademisyen1.insanBilgileri(); // Miras aldigi siniftan Overriding yapiyor
		idare1.insanBilgileri(); // Miras aldigi siniftan Overriding yapiyor

		o1.BakiyeYukle(10); // Overloading veri yollayarak bakiye yukleme
		o1.BakiyeYukle(); // Overloading - konsol ile

		edebiyat.ogrenciSinifaGit(o1); // has-a iliskisi edebiyat sinifi ogrenci sinifini kullaniyor
		edebiyat.akademisyenSinifaGit(akademisyen1); // has-a iliskisi edebiyat sinifi akademisyen sinifini kullaniyor

		o1.yemekSatinAl(); // yemek satin aliyor
		o1.yemekKartiDurumuOgren(); // yemek karti durumu tespit ediyor
		o1.yemekKartiVer(0); // yemek karti veriyor
		o1.yemekKartiDurumuOgren(); // yemek karti verildi mi tekrar kontrol
		o1.bakiyeOgren(); // bakiye ogreniyor
		Ogrenci.yemekListesi(); // yemek listesini veriyor
		o1.bakiyeOgren(); // bakiye ogreniyor
		o1.yemekSatinAl(); // yemek satin aliyor
		o1.bakiyeOgren(); // yemek alimindan sonra bakiye kontrolü
		o1.yemekSatinAl(); // tekrar yemek satin aliyor
		o1.BakiyeYukle(); // bakiye yüklüyor
		o1.bakiyeOgren(); // bakiye yüklenildi mi kontrol

		akademisyen1.yemekSatinAl(); // yemek satin aliyor
		akademisyen1.yemekKartiDurumuOgren(); // yemek karti durumu tespit ediyor
		akademisyen1.yemekKartiVer(0); // yemek karti veriyor
		akademisyen1.yemekKartiDurumuOgren(); // yemek karti verildi mi tekrar kontrol
		akademisyen1.bakiyeOgren(); // bakiye ogreniyor
		akademisyen1.yemekListesi(); // yemek listesini veriyor
		akademisyen1.bakiyeOgren(); // bakiye ogreniyor
		akademisyen1.yemekSatinAl(); // yemek satin aliyor
		akademisyen1.bakiyeOgren(); // yemek alimindan sonra bakiye kontrolü
		akademisyen1.yemekSatinAl(); // tekrar yemek satin aliyor
		akademisyen1.BakiyeYukle(); // bakiye yüklüyor
		akademisyen1.bakiyeOgren(); // bakiye yüklenildi mi kontrol

		idare1.yemekSatinAl(); // yemek satin aliyor
		idare1.yemekKartiDurumuOgren(); // yemek karti durumu tespit ediyor
		idare1.yemekKartiVer(); // yemek karti veriyor
		idare1.yemekKartiDurumuOgren(); // yemek karti verildi mi tekrar kontrol
		idare1.bakiyeOgren(); // bakiye ogreniyor
		idare1.yemekListesi(); // yemek listesini veriyor
		idare1.bakiyeOgren(); // bakiye ogreniyor
		idare1.yemekSatinAl(); // yemek satin aliyor
		idare1.bakiyeOgren(); // yemek alimindan sonra bakiye kontrolü
		idare1.yemekSatinAl(); // tekrar yemek satin aliyor
		idare1.BakiyeYukle(); // bakiye yüklüyor
		idare1.bakiyeOgren(); // bakiye yüklenildi mi kontrol

	}
}


