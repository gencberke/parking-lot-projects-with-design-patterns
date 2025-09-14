import java.util.List;

public class Abonelik {

    private int id;
    private String baslangicTarihi;
    private String bitisTarihi;
    private double ucret;
    private Arac arac;
    private List<Odeme> odemeler;

    public Abonelik(Builder builder) {
        this.id = builder.id;
        this.baslangicTarihi = builder.baslangicTarihi;
        this.bitisTarihi = builder.bitisTarihi;
        this.ucret = builder.ucret;
        this.arac = builder.arac;
        this.odemeler = builder.odemeler;
    }

    public static class Builder {

        private int id;
        private String baslangicTarihi;
        private String bitisTarihi;
        private double ucret;
        private Arac arac;
        private List<Odeme> odemeler;

        public Builder setArac(Arac arac) {
            this.arac = arac;
            return this;
        }

        public Builder setBaslangicTarihi(String baslangicTarihi) {
            this.baslangicTarihi = baslangicTarihi;
            return this;

        }

        public Builder setBitisTarihi(String bitisTarihi) {
            this.bitisTarihi = bitisTarihi;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setOdemeler(List<Odeme> odemeler) {
            this.odemeler = odemeler;
            return this;
        }

        public Builder setUcret(double ucret) {
            this.ucret = ucret;
            return this;
        }

        public Abonelik build() {
            return new Abonelik(this);
        }

    }

    public Arac getArac() {
        return arac;
    }

    public String getBaslangicTarihi() {
        return baslangicTarihi;
    }

    public String getBitisTarihi() {
        return bitisTarihi;
    }

    public int getId() {
        return id;
    }

    public List<Odeme> getOdemeler() {
        return odemeler;
    }

    public double getUcret() {
        return ucret;
    }


}
