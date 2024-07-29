package abstractizareRestaurant;

public class Restaurant {

    private String numeRestaurant;
    private String meniu;
    private String adresa;
    private Boolean delivery;
    private String tipRestaurant;

    public Restaurant(String numeRestaurant, String meniu, String adresa, Boolean delivery, String tipRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.meniu = meniu;
        this.adresa = adresa;
        this.delivery = delivery;
        this.tipRestaurant = tipRestaurant;
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    public String getMeniu() {
        return meniu;
    }

    public void setMeniu(String meniu) {
        this.meniu = meniu;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    public String getTipRestaurant() {
        return tipRestaurant;
    }

    public void setTipRestaurant(String vegan) {
        this.tipRestaurant = vegan;
    }
}
