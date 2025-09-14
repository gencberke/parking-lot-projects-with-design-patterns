public class Otopark {

    private static Otopark dummy;
    private int id;
    private String ad;

    private String konum;

    private String tur; // açık veya kapalı otopark

    private int aracKapasite;

    public Otopark() {
    }

    public static Otopark getDummy() {
        if (dummy == null) {
            dummy = new Otopark();
        }
        return dummy;
    }

}
