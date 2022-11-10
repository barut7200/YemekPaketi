
import java.util.Scanner;

public class YemekKarti { // miras veriyor

	static int Yemek1 = 10; // 4 yemek tanimladim static olma sebebi yemek listesinden dolayi
	static int Yemek2 = 15;
	static int Yemek3 = 5;
	static int Yemek4 = 75;
	static int OgrenciOzel = 4;
	private boolean yemekKarti; // yemek karti var mi yok mu ogrenmek icin
	private int bakiye;
	private static int yemekKartiSayac = 0; // kac kiside yemekKarti var saymak icin
	Scanner klavye = new Scanner(System.in); // konsol verisi almak icin scanner

	YemekKarti() { // Constructor yapicis

		yemekKartiSayac++;
	}

	void yemekKartiVer(int bakiye) { // yemek karti vermeye ve kontrol etmeye yarayan fonksiyon

		if (yemekKarti) { // eger yemek karti onceden verildiyse onu boolean ile anlayan blok
			System.out.println("Yemek karti onceden verilmistir");
			this.yemekKarti = true;
		}

		else if (yemekKarti == false) { // eger yemek karti yoksa devamı calisacak

			int anahtar = 0;
			System.out.println("Bakiye yukleyeceksen 1 e tikla - Yuklemeyeceksen 0");
			System.out.print("Seciminizi Giriniz = ");
			String input = klavye.next();

			try {

				while (true) {
					anahtar = Integer.valueOf(input);
					if (anahtar == 1) {
						System.out.print("Yuklenecek bakiyeyi gir = ");
						bakiye = klavye.nextInt();
						if (bakiye >= 100) {
							this.bakiye = bakiye;
							System.out.println("Bakiye Yuklenmistir Yeni Bakiyeniz = " + bakiye);
							this.yemekKarti = true;
							break;

						}
						if (bakiye < 100) {
							System.out.println("Minimum 100 ve ustu yuklenir tekrar denemek icin 1 e tiklayin");
							System.out.print("Seciminizi Giriniz = ");
							anahtar = klavye.nextInt();

						}
					}

					else
						System.out.println("Standart bakiye tarifesi uygulanmistir 100 ");
					bakiye = 100;
					this.yemekKarti = true;
					break;

				}

			} catch (Exception e) {
				System.err.println("hatali giris int girmediginiz icin sonlandi");
			}

		}
	}

	void bakiyeOgren() { // bakiye ogrenmeye yariyor
		System.out.println("Guncel bakiyeniz = " + this.bakiye);
	}

	void yemekKartiDurumuOgren() { // yemek karti durumu ogrenmeye yariyor
		if (yemekKarti) {
			System.out.println("Yemek kartiniz vardir.");
		} else {
			System.out.println("Yemek Kartiniz Yoktur");
		}
	}
	
	void BakiyeYukle() { // istedigin zaman bakiye yuklemeye yariyor
		System.out.print("Yuklenecek bakiyeyi giriniz = ");
		int temp = klavye.nextInt();
		this.bakiye += temp;
		System.out.println("Yuklenen bakiye = " + bakiye);
	}

	void BakiyeYukle(int bakiye) { // istedigin zaman bakiye yuklemeye yariyor
		this.bakiye += bakiye;
		System.out.println("Yuklenen bakiye = " + bakiye);
	}

	static void yemekListesi() { // yemek listesi
		System.out.println("Adi Yemek1 fiyati = " + Yemek1 + "\n" + "Adi Yemek2 fiyati = " + Yemek2 + "\n"
				+ "Adi Yemek3 fiyati = " + Yemek3 + "\n" + "Adi Yemek4 fiyati = " + Yemek4 + "\n");
	}

	void yemekSatinAl() { // switch case ile yemek satin almaya yariyor yemek karti yoksa alim yapilmiyor
		if (yemekKarti) {
			System.out.println(
					"Satin alcaginiz yemegi seciniz - 1 den baslar - yemek almaktan vazgectiyseniz 99 u tuslayin");

			int secim = klavye.nextInt();

			switch (secim) {
			case 1:
				if (bakiye < Yemek1) {
					System.out.println("Paraniz yetmedi");
					break;

				} else {
					System.out.println("Yemek1 urunu basariyla aldiniz.");
					this.bakiye = bakiye - Yemek1;
					break;
				}

			case 2:
				if (bakiye < Yemek2) {
					System.out.println("Paraniz yetmedi");
					break;

				} else {
					System.out.println("Yemek2 urunu basariyla aldiniz.");
					this.bakiye = bakiye - Yemek2;
					break;
				}

			case 3:
				if (bakiye < Yemek3) {
					System.out.println("Paraniz yetmedi");
					break;

				} else {
					System.out.println("Yemek4 urunu basariyla aldiniz.");
					this.bakiye = bakiye - Yemek3;
					break;
				}

			case 4:
				if (bakiye < Yemek4) {
					System.out.println("Paraniz yetmedi");
					break;

				} else {
					System.out.println("Yemek4 urunu basariyla aldiniz.");
					this.bakiye = bakiye - Yemek4;
					break;
				}
			case 5:
				if (bakiye < OgrenciOzel) {
					System.out.println("Paraniz yetmedi");
					break;

				} else {
					System.out.println("OgrenciOzel urunu basariyla aldiniz.");
					this.bakiye = bakiye - OgrenciOzel;
					break;
				}
			case 99:
				break;

			default:
				System.err.println("Hatali Secim yaptiniz satin alamadiniz");

			}

		} else {
			System.out.println("Yemek kartiniz olmadigi icin alisveris yapamazsiniz");
		}
	}

	void yemekiadeEt() { // yemek iade etmeye yariyor efektif değil

		System.out.println("Iade edilecek yemegi tuslayiniz");
		int iadeyemek = klavye.nextInt();

		if (iadeyemek == 1) {
			bakiye += 10;
			System.out.println("Paraniz iade edilmistir " + bakiye);
		} else if (iadeyemek == 2) {
			bakiye += 15;
			System.out.println("Paraniz iade edilmistir " + bakiye);
		} else if (iadeyemek == 3) {
			bakiye += 5;
			System.out.println("Paraniz iade edilmistir " + bakiye);
		} else if (iadeyemek == 4) {
			bakiye += 101;
			System.out.println("Paraniz iade edilmistir " + bakiye);
		} else if (iadeyemek == 5) {
			bakiye += 65;
			System.out.println("Paraniz iade edilmistir " + bakiye);
		} else {
			System.out.println("Hatali tuslama yaptiniz");
		}
	}

	void yemekiadeEt(int n) { // yemek iade etmeye yariyor - direkt veri yollaniyor Overload

		if (n == 1) {
			bakiye += 10;
			System.out.println("Paraniz iade edilmistir " + bakiye);
		} else if (n == 2) {
			bakiye += 15;
			System.out.println("Paraniz iade edilmistir " + bakiye);
		} else if (n == 3) {
			bakiye += 5;
			System.out.println("Paraniz iade edilmistir " + bakiye);
		} else if (n == 4) {
			bakiye += 101;
			System.out.println("Paraniz iade edilmistir " + bakiye);
		} else if (n == 5) {
			bakiye += 65;
			System.out.println("Paraniz iade edilmistir " + bakiye);
		} else {
			System.out.println("Hatali tuslama yaptiniz");
		}
	}

	void KacYemekKartiVar() { // yemek kartina sahip kac kisi var onu söylüyor
		System.out.println("Yemek kartina sahip olan kisi sayisi " + yemekKartiSayac);
	}
}



