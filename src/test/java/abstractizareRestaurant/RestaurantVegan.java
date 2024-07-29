package abstractizareRestaurant;

public class RestaurantVegan extends Restaurant implements VeganInterface{

    public RestaurantVegan(String numeRestaurant, String meniu, String adresa, Boolean delivery, String tipRestaurant) {
        super(numeRestaurant, meniu, adresa, delivery, tipRestaurant);
    }

    @Override
    public void gatesteVegan() {

    }

    @Override
    public void prezentareMeniu() {

    }
}
