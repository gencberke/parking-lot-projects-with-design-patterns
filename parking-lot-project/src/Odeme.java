public class Odeme {

    private int id;
    private String tarih;
    private double tutar;
    private String odemeTur; // peşin, kredi veya havale

    public void setId(int id) {
        this.id = id;
    }

    public void setOdemeTur(String odemeTur) {
        this.odemeTur = odemeTur;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }
}
