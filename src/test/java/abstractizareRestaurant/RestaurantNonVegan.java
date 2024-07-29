package abstractizareRestaurant;

public class RestaurantNonVegan extends Restaurant implements NonVeganInterface{
    public RestaurantNonVegan(String numeRestaurant, String meniu, String adresa, Boolean delivery, String tipRestaurant) {
        super(numeRestaurant, meniu, adresa, delivery, tipRestaurant);
    }

    @Override
    public void gatesteNonVegan() {

    }

    @Override
    public void prezentareMeniu() {

    }
}
