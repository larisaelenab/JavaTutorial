package oop;

import java.util.List;

public class VolkswagenConfigurator extends MasinaConfigurator {

    private String linieDeEchipare;
    private String motor;
    private String vopsea;
    private String roti;
    private String tapiterie;
    private List<String> dotariOptionale;
    private Double pretStandard;
    private Double pretFinal;


    public VolkswagenConfigurator(String marca, String model, Integer an, String linieDeEchipare,
                                  String motor, String vopsea, String roti, String tapiterie, List<String> dotariOptionale) {
        super(marca, model, an);
        this.linieDeEchipare = linieDeEchipare;
        this.motor = motor;
        this.vopsea = vopsea;
        this.roti = roti;
        this.tapiterie = tapiterie;
        this.dotariOptionale = dotariOptionale;
    }

    public void infoVolkswagen(){
        infoMasina();
        System.out.println("Linia de echipare a masinii este: " + linieDeEchipare + ".");
        System.out.println("Motorul masinii este: " + motor + ".");
        System.out.println("Vopseaua masinii este: " + vopsea + ".");
        System.out.println("Rotile masinii sunt: " + roti + ".");
        System.out.println("Tapiteria masinii este: " + tapiterie + ".");
        System.out.println("Dotarile optionale ale masinii sunt: ");
        for (Integer t=0; t< dotariOptionale.size(); t++){
            System.out.println(dotariOptionale.get(t));
        }
        calculPretStandard();
        calculPretFinal();
    }

    //trebuie sa determinam pretul standard in functie de modelul masinii
    public void calculPretStandard(){
        if(getModel().equals("Polo")){
            switch (linieDeEchipare){
                case "Life":
                    pretStandard = 20.194;
                    break;
                case "Advanced":
                    pretStandard = 20.675;
                    break;
                case "Style":
                    pretStandard = 21.088;
                    break;
                case "R-Line":
                    pretStandard = 21.601;
                    break;
            }
        }
        System.out.printf("Pretul standard al masinii este: %,.3f \n", pretStandard);
    }

    public void calculPretFinal(){
        Double pretOptiuni = 0.000;
        if(getModel().equals("Polo")){
            if (linieDeEchipare.equals("Advanced")){
                switch (vopsea){
                    case "gri":
                        pretOptiuni += 0.000;
                        break;
                    case "alb":
                        pretOptiuni += 0.210;
                        break;
                    case "albastru":
                        pretOptiuni += 0.518;
                        break;
                }
                switch (roti){
                    case "otel 15":
                        pretOptiuni += 0.000;
                        break;
                }
                switch (tapiterie){
                    case "stofa":
                        pretOptiuni += 0.000;
                        break;
                }
                for (Integer i = 0; i < dotariOptionale.size(); i++){
                    switch (dotariOptionale.get(i)){
                        case "pachet confort":
                            pretOptiuni += 0.150;
                            break;
                        case "trapa":
                            pretOptiuni += 0.590;
                            break;
                        case "alarma antifurt":
                            pretOptiuni += 0.860;
                            break;
                    }
                }
            }
        }
        pretFinal = pretStandard + pretOptiuni;
        System.out.printf("Pretul final al masinii este: %,.3f \n", pretFinal);
    }

    public String getLinieDeEchipare() {
        return linieDeEchipare;
    }

    public String getMotor() {
        return motor;
    }

    public String getVopsea() {
        return vopsea;
    }

    public String getRoti() {
        return roti;
    }

    public String getTapiterie() {
        return tapiterie;
    }

    public List<String> getDotariOptionale() {
        return dotariOptionale;
    }

    public Double getPretStandard() {
        return pretStandard;
    }

    public Double getPretFinal() {
        return pretFinal;
    }

    public void setLinieDeEchipare(String linieDeEchipare) {
        this.linieDeEchipare = linieDeEchipare;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setVopsea(String vopsea) {
        this.vopsea = vopsea;
    }

    public void setRoti(String roti) {
        this.roti = roti;
    }

    public void setTapiterie(String tapiterie) {
        this.tapiterie = tapiterie;
    }

    public void setDotariOptionale(List<String> dotariOptionale) {
        this.dotariOptionale = dotariOptionale;
    }
}
