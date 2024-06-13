package variabilaMetoda;

import org.testng.annotations.Test;

public class Masina {

    public String marca;
    public String model;
    public Float pret;
    public Boolean esteDecapotabila;
    public Double greutate;


    @Test
    public void metodaTest(){
        afisareMasina();
        System.out.println("===Exemplu 2===");
        afisareOriceMasina("dacia", "tuareg", 2345.99f, 5862.00);
        System.out.println("===Exemplu 3===");
        afisareOriceMasina("mercedes", "model2", 56856.00f, 56852.56);
    }

    //Descrie masina

    public void afisareMasina(){
        marca = "BMW";
        model = "who knows";
        pret = 2563.56f;
        greutate = 556253.200d;
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Pretul masinii este " + pret);
        System.out.println("Greutatea masinii este " + greutate);
    }


    //descriem orice masina

    public void afisareOriceMasina(String marca, String model, Float pret, Double greutate){
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Pretul masinii este " + pret);
        System.out.println("Greutatea masinii este " + greutate);


    }


}
