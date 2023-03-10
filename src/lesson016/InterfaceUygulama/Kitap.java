package lesson016.InterfaceUygulama;

public class Kitap {

	private String isim;
	private String yazar;
	private int fiyat;
	private boolean indirimdeMi;

	public Kitap(String isim, String yazar, int fiyat) {
		super();
		this.isim = isim;
		this.yazar = yazar;
		this.fiyat = fiyat;
	}

	public Kitap() {

	}

	public boolean isIndirimdeMi() {
		return indirimdeMi;
	}

	public void setIndirimdeMi(boolean indirimdeMi) {
		this.indirimdeMi = indirimdeMi;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

}
