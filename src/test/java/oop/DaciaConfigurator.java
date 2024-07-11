package oop;

import java.util.List;

public class DaciaConfigurator extends MasinaConfigurator {

    public String versiune;
    public String motor;
    public String culoare;
    public String jante;
    public String interior;
    public List<String> echipamente;
    public List<String> accesorii;

    public DaciaConfigurator(String marca, String model, Integer an, String versiune, String motor,
                             String culoare, String jante, String interior, List<String> echipamente, List<String> accesorii) {
        super(marca, model, an);
        this.versiune = versiune;
        this.motor = motor;
        this.culoare = culoare;
        this.jante = jante;
        this.interior = interior;
        this.echipamente = echipamente;
        this.accesorii = accesorii;
    }

    public void infoDacia(){
        infoMasina();
        System.out.println("Versiunea masinii este: " + versiune + ".");
        System.out.println("Motorul masinii este: " + motor + ".");
        System.out.println("Culoarea masinii este: " + culoare + ".");
        System.out.println("Jantele masinii sunt: " + jante + ".");
        System.out.println("Interiorul masinii este: " + interior + ".");

        System.out.println("Echipamentele masinii sunt: ");
        for (Integer i=0; i< echipamente.size(); i++){
            System.out.println(echipamente.get(i));
        }
        System.out.println("Accesoriile masinii sunt: ");
        for (Integer y=0; y< accesorii.size(); y++){
            System.out.println(accesorii.get(y));
        }
        calculPretStandard();
        calculPretFinal();
    }

    //trebuie sa determinam pretul standard in functie de modelul masinii
    public void calculPretStandard(){
        if(model.equals("Logan")){
            switch (versiune){
                case "Essential":
                    pretStandard = 13.500;
                    break;
                case "Expression":
                    pretStandard = 14.150;
                    break;
                case "Journey":
                    pretStandard = 15.250;
                    break;
                case "Journey+":
                    pretStandard = 15.700;
                    break;
            }
        }
        System.out.printf("Pretul standard al masinii este: %,.3f \n", pretStandard);
    }

    public void calculPretFinal(){
        Double pretOptiuni = 0.000;
        if(model.equals("Logan")){
            if (versiune.equals("Essential")){
                switch (culoare){
                    case "gri":
                        pretOptiuni += 0.500;
                        break;
                    case "alb":
                        pretOptiuni += 0.500;
                        break;
                    case "albastru":
                        pretOptiuni += 0.550;
                        break;
                }
                switch (jante){
                    case "otel 16":
                        pretOptiuni += 0.250;
                        break;
                }
                switch (interior){
                    case "expression":
                        pretOptiuni += 0.000;
                        break;
                }
            }
        }
        pretFinal = pretStandard + pretOptiuni;
        System.out.printf("Pretul final al masinii este: %,.3f \n", pretFinal);
    }
}
