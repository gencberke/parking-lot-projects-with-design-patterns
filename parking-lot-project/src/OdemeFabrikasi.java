public class OdemeFabrikasi {

    public static Odeme odemeOlustur(String tur, double tutar, String tarih) {
        Odeme odeme = new Odeme();

        odeme.setOdemeTur(tur);

        odeme.setTutar(tutar);
        odeme.setTarih(tarih);
        return odeme;

    }

}
