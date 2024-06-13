package tema.obiect;

import java.util.List;
import java.util.Map;

public class Masini {

    public String marca;
    public String model;
    public Float pret;
    public Integer anfabricatie;
    public String combustibil;
    public Integer km;
    public Boolean eNoua;
    public Map<String, List<String>> dotari;
    public Integer capacitateCilindrica;

    public Masini(String marca, String model, Float pret, Integer anfabricatie,
                  String combustibil, Integer km, Boolean eNoua, Map<String, List<String>> dotari, Integer capacitateCilindrica) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.anfabricatie = anfabricatie;
        this.combustibil = combustibil;
        this.km = km;
        this.eNoua = eNoua;
        this.dotari = dotari;
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public void prezentareMasina(){
        System.out.println("Marca masina: "+marca+".");
        System.out.println("Model masina: "+model+".");
        System.out.println("Pret masina: "+pret+".");
        System.out.println("An fabricatie masina: "+anfabricatie+".");
        System.out.println("Combustibil: "+combustibil+".");
        System.out.println("Km parcursi: "+km+".");
        System.out.println("Dotarile masinii sunt: ");
        for (Integer index=0; index<dotari.size();index++) {
            System.out.println(dotari.get(index));
        }
    }

    public void impozitMasinaAnFabricatie(){
        if (anfabricatie >= 2020 && anfabricatie <= 2024){
            System.out.println("Impozitul masinii este de 2%.");
        }
        else if (anfabricatie >= 2010 && anfabricatie < 2020){
            System.out.println("Impozitul masinii este de 10%.");
        }
        else{
            System.out.println("Impozitul masinii este de 15%.");
        }
    }

    public void impozitMasinaCapacitateCilindrica(){
        if (capacitateCilindrica > 1001 && capacitateCilindrica < 1200){
            System.out.println("Impozitul auto în 2024 este de 54 lei.");
        } else if (capacitateCilindrica > 1201 && capacitateCilindrica < 1400) {
            System.out.println("Impozitul auto în 2024 este de 63 lei.");
        } else if (capacitateCilindrica > 1401 && capacitateCilindrica < 1600) {
            System.out.println("Impozitul auto în 2024 este de 72 lei.");
        }

    }

    public void statutMasina(){
        if (eNoua = true){
            System.out.println("Masina este noua.");
        }
        else if (km > 20000){
            System.out.println("Masina este veche.");
        }
    }

    public void masinaNoua(){
        if (eNoua = true){
            System.out.println();
        }
    }

}
//2020-2024 impozit = 2%
//2010-2020 impozit = 10%
//<2010 impozit = 15%
//in functie de km -> daca are nr km > x --> veche/ medium?? statutMasina
//
