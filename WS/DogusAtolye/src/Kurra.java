
public class Kurra {
	public static void main(String[] args) throws InterruptedException {
		String[] isimler = { "Göknil kömürcü", "Bora Baykar", "Bilge GÜNEŞ ", "Saliha Köprülü", "Bilal Özdemir",
				"Semanur konur", "Batuhan Özmen", "Ahmet Melih islam", "Enes Balay", "Salih Eren Tahmaz",
				"Nurullah Guguk ", "Efe tatlı",
				// "Semih Bölükbaşı",
				"Başak Nazik", "Gökçe Nur Temel", "Buse Çallı ", "Senanur Kaya", "Boran Şen", "Mehmet Haydar Gülen",
				"Çağatay Sunal", "Cemre Yusuf Cibaroğlu ", "Ayşenur Uğur ", "Yusuf Altunoymak", "Nedim can Nebioglu",
				"Turhan Can Kargın", "kayaserifmert@gmail.com ", "Hilal Coşkun ", "Bilal Erkam Yaman ", "Ahmet simsek",
				"Yunus Emre Balkis ", "Burak YILDIZ ",
				// "Melike Betül Çakan ",
				"Kadir TOMAS",
				// "Tugay SARICI",
				"Feride Kaya",
				// "Dilay Ferik",
				"Necibe Can", "Mehmet YILDIZ", "Muzaffer Çakır ", "Mücahit Fatih Parlağı",
				// "Kerem Cihangir",
		};

		int index = (int) (Math.random() * isimler.length);

		for (int i = 0; i < 10; i++) {
			System.out.println("Hesaplanıyor");
			Thread.sleep(1000);
		}

		System.out.println(isimler[index]);

		/*
		 * for (int i = 0; i < 10; i++) { System.out.println((int) (Math.random() * 5) +
		 * 10); }
		 */
	}

}
