package oop;

public class MasinaConfigurator {
    public String marca;
    public String model;
    public Integer an;
    public Double pretStandard;
    public Double pretFinal;

    public MasinaConfigurator(String marca, String model, Integer an) {
        this.marca = marca;
        this.model = model;
        this.an = an;
    }

    //OOP = programare orientare obiect
    //OOP = 4 principii -> Mostenire; Incapsulare; Polimorfism; Abstractizare
    //Mostenirea = conceptul prin care o clasa mosteneste o alta clasa
    //Clasa care este mostenita = parinte
    //Clasa care mosteneste = copil
    //In Java putem mosteni o singura clasa
    //Mostenirea se realizeaza cu cuvantul "extends"
    //Cand copilul mosteneste parintele, copilul trebuie sa apeleze constructorul din parinte
    //Copilul va avea acces la proprietatile/ metodele din clasa parinte (daca se foloseste public/protected/default)
    //Ca sa apelam constructorul din parinte in copil se foloseste cuvantul "super"

    public void infoMasina(){
        System.out.println("Marca masinii este: " + marca + ".");
        System.out.println("Modelul masinii este: " + model + ".");
        System.out.println("Anul masinii este: " + an + ".");
    }

}
