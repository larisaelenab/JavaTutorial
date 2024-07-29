package abstractizareRestaurant;

public class RestaurantMixt extends Restaurant implements VeganInterface, NonVeganInterface{
    public RestaurantMixt(String numeRestaurant, String meniu, String adresa, Boolean delivery, String tipRestaurant) {
        super(numeRestaurant, meniu, adresa, delivery, tipRestaurant);
    }

    @Override
    public void gatesteNonVegan() {

    }

    @Override
    public void gatesteVegan() {

    }

    @Override
    public void prezentareMeniu() {

    }
}
