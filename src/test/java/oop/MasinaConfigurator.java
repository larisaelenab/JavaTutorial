package oop;

public class MasinaConfigurator {
    private String marca;
    private String model;
    private Integer an;

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

    //Incapsulare = conceptul prin care putem sa setam anumite restrictii de vizibilitate pentru proprietati/metode


    //polimorfism = conceptul prin care o metoda poate avea implementari diferite
    //polimorfismul poate fi de 2 feluri: dinamic (override) si static (overload)
    //polimorfism dinamic = intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite
    //polimorfismul dinamic este prezent doar la mostenire
    //polimorfism static = daca avem nevoie ca o metoda sa fie folosita in diferite circumstante,
    //putem defini mai multe metode cu acelasi nume, avand nr de parametri/ tip de parametri diferiti


    public void infoMasina(){
        System.out.println("Marca masinii este: " + marca + ".");
        System.out.println("Modelul masinii este: " + model + ".");
        System.out.println("Anul masinii este: " + an + ".");
    }

    //polimorfism dinamic
    public void pornesteMotorul(){
        System.out.println("Masina se porneste cu ajutorul cheii.");
    }

    public void deschidereGeam(){
        System.out.println("Geamurile se deschid manual.");
    }

    //polimorfism static
    public void promotieDacia(){
        System.out.println("Pt luna iulie, Dacia nu are promotii.");
    }

    public void promotieDacia(String tichet){
        System.out.println("Daca ai " + tichet +  ", primesti reducere.");
    }

    public void promotieDacia(Integer reducere){
        System.out.println("In luna decembrie, masinile Dacia primesc " + reducere + " reducere.");
    }


    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public Integer getAn() {
        return an;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAn(Integer an) {
        this.an = an;
    }
}
