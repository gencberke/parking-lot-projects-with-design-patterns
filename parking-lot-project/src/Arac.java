public class Arac {

    private String plakaNo;
    private String tip; // binek, büyük

    public Arac(String plakaNo, String tip) {
        this.plakaNo = plakaNo;
        this.tip = tip;
    }

    public String getPlakaNo() {
        return plakaNo;
    }

    public void setPlakaNo(String plakaNo) {
        this.plakaNo = plakaNo;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
