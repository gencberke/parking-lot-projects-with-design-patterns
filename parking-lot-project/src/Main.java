import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Singleton ile Otopark oluşturalım

        Otopark otopark = Otopark.getDummy();
        System.out.println("Otopark oluşturuldu: " + otopark);

        // Factory kullanarak 3 farklı ödeme oluşturalım

        Odeme odeme1 = OdemeFabrikasi.odemeOlustur("peşin", 10, "2023-04-12");
        Odeme odeme2 = OdemeFabrikasi.odemeOlustur("kredi", 40, "2022-02-22");
        Odeme odeme3 = OdemeFabrikasi.odemeOlustur("havale", 70, "2024-07-12");

        List<Odeme> odemeListesi = new ArrayList<>();

        odemeListesi.add(odeme1);
        odemeListesi.add(odeme2);
        odemeListesi.add(odeme3);

        // Abonelik oluşturalım
        Arac arac = new Arac("34ZBU79", "Ticari");

        Abonelik abonelik = new Abonelik.Builder().setId(1)
                .setBaslangicTarihi("2025-04-12")
                .setBitisTarihi("2025-04-23")
                .setUcret(520.0)
                .setArac(arac)
                .setOdemeler(odemeListesi).build();

        // Yazdıralım

        System.out.println("Oluşturduğumuz abonelik:");
        System.out.println("Plaka: " + abonelik.getArac().getPlakaNo());
        System.out.println("Toplam ödeme: " + abonelik.getOdemeler().size() + " adet");

    }
}
