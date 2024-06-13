package obiect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Telefon {

    public String marca;
    public String model;
    public String culoare;
    public String memorie;
    public Integer pret;
    public Map<String, String> specsTehnice;
    public List<String> accesorii;
    public Boolean produsResigilat;
    public String observatii;

    public Telefon(String marca, String model, String culoare, String memorie, Integer pret, Map<String,
            String> specsTehnice, List<String> accesorii, Boolean produsResigilat) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.memorie = memorie;
        this.pret = pret;
        this.specsTehnice = specsTehnice;
        this.accesorii = accesorii;
        this.produsResigilat = produsResigilat;
    }

    public Telefon(String marca, String model, String culoare, String memorie, Integer pret, Map<String,
            String> specsTehnice, List<String> accesorii, Boolean produsResigilat, String observatii) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.memorie = memorie;
        this.pret = pret;
        this.specsTehnice = specsTehnice;
        this.accesorii = accesorii;
        this.produsResigilat = produsResigilat;
        this.observatii = observatii;
    }

    public void infoTelefon(){
        System.out.println("Marca telefon: "+marca+".");
        System.out.println("Model telefon: "+model+".");
        System.out.println("Culoarea telefonului este "+culoare+".");
        System.out.println("Memoria telefonului este de "+memorie+".");
        System.out.println("Pretul telefonului este de "+pret+"euro.");

        System.out.println("Specificatiile tehnice ale telefonului sunt: ");
        for (String key: specsTehnice.keySet()){
            System.out.println(key + " " + specsTehnice.get(key));
        }

        System.out.println("Accesoriile telefonului sunt: ");
        for (Integer index=0; index<accesorii.size();index++) {
            System.out.println(accesorii.get(index));
        }

        if (produsResigilat){
            System.out.println("Produsul este resigilat.");
            System.out.println(observatii);
        }

    }


}
