
public class Ogrenci {
	String isim;
	String soyisim;
	int dogumYili;
	String okulNumarasi;

	public Ogrenci() {

	}

	public Ogrenci(String i, String s, int d, String o) {

	}
	public void isimVer(String i) {
		if (i.length()<3) {
		System.out.println("Ýsim yanlýþ");
		}
		
	}
}
