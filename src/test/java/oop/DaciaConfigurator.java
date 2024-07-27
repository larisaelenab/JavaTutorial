package oop;

import java.util.List;

public class DaciaConfigurator extends MasinaConfigurator {

    private String versiune;
    private String motor;
    private String culoare;
    private String jante;
    private String interior;
    private List<String> echipamente;
    private List<String> accesorii;
    private Double pretStandard;
    private Double pretFinal;

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

    //aplicam polimorfismul dinamic
    public void pornesteMotorul(){
        System.out.println("Masinile Dacia pornesc de la buton.");
    }

    public void deschidereGeam(){
        System.out.println("Geamurile la Dacia sunt electrice.");
    }

    //trebuie sa determinam pretul standard in functie de modelul masinii
    public void calculPretStandard(){
        if(getModel().equals("Logan")){
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
        if(getModel().equals("Logan")){
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
                for (Integer i = 0; i < echipamente.size(); i++){
                    switch (echipamente.get(i)){
                        case "pachet tehno":
                            pretOptiuni += 0.150;
                            break;
                        case "pachet clima":
                            pretOptiuni += 0.590;
                            break;
                        case "pachet parking":
                            pretOptiuni += 0.860;
                            break;
                    }
                }
                for (Integer i = 0; i < accesorii.size(); i++){
                    switch (accesorii.get(i)){
                        case "covorase":
                            pretOptiuni += 0.040;
                            break;
                        case "scrumiera":
                            pretOptiuni += 0.010;
                            break;
                        case "suport pahare":
                            pretOptiuni += 0.010;
                            break;
                    }
                }
            }
        }
        pretFinal = pretStandard + pretOptiuni;
        System.out.printf("Pretul final al masinii este: %,.3f \n", pretFinal);
    }

    public String getVersiune() {
        return versiune;
    }

    public String getMotor() {
        return motor;
    }

    public String getJante() {
        return jante;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getInterior() {
        return interior;
    }

    public List<String> getEchipamente() {
        return echipamente;
    }

    public List<String> getAccesorii() {
        return accesorii;
    }

    public Double getPretStandard() {
        return pretStandard;
    }

    public Double getPretFinal() {
        return pretFinal;
    }

    public void setVersiune(String versiune) {
        this.versiune = versiune;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setJante(String jante) {
        this.jante = jante;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void setEchipamente(List<String> echipamente) {
        this.echipamente = echipamente;
    }

    public void setAccesorii(List<String> accesorii) {
        this.accesorii = accesorii;
    }
}
