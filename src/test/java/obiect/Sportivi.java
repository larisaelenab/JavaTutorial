package obiect;

import com.google.j2objc.annotations.Weak;

public class Sportivi {

    //programarea orientata obiect se bazeaza pe interactiunea cu obiecte
    //obiect = instanta unei clase
    //putem defini un obiect doar daca avem un constructor
    //constructorul = are ca rol sa initializeze atributele unei clase
    //intr-o clasa recunoastem un constructor dupa numele acesteia
    //constructorul este de cele mai multe ori public
    //intr-o clasa pot sa fie mai multi constructori diferentiati dupa numarul sau tipul de parametri
    //intr-o clasa avem un constructor by default fara parametri
    //in momentul cand se defineste un obiect se apeleaza constructorul din clasa
    //dintr-o clasa putem defini mai multe obiecte
    //obiectele se diferentiaza prin nume si valorile date
    //un obiect se instantiaza folosind cuvantul "new"
    //un obiect se poate defini in orice clasa din orice pachet
    //in momentul cand instantiem un obiect putem avea acces la toate variabilele/ metodele din clasa


    public String nume;
    public String prenume;
    public Integer varsta;
    public String sex;
    public String tipSport;
    public Boolean teamSport;
    public Integer salariu;

    //constructor
    public Sportivi(String nume, String prenume, Integer varsta, String sex, String tipSport, Boolean teamSport) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.tipSport = tipSport;
        this.teamSport = teamSport;
    }

    public Sportivi(String nume, String prenume, Integer varsta, String sex, String tipSport, Boolean teamSport, Integer salariu) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.tipSport = tipSport;
        this.teamSport = teamSport;
        this.salariu = salariu;
    }

    public void prezentareSportiv(){
        System.out.println("Numele sportivului este "+nume+".");
        System.out.println("Prenumele sportivului este "+prenume+".");
        System.out.println("Varsta sportivului este "+varsta+".");
        System.out.println("Sexul sportivului este "+sex+".");
        System.out.println("Tipul de sport practicat: "+tipSport+".");
        System.out.println("Sportivul practica un sport de echipa? "+teamSport+".");
        if (salariu!=null){
            System.out.println("Salariul sportivului este "+salariu+".");
        }

    }

    public void verificareVarsta(){
        if (varsta>=18){
            System.out.println("Sportivul este major.");
        }
        else{
            System.out.println("Sportivul este minor.");
        }
    }


    public void marireSalariu(Integer procent){
        if (salariu!=null){
            Integer marire = (salariu*procent)/100;
            salariu = salariu+marire;
            System.out.println("Noul salariu este "+salariu+".");
        }
        else {
            System.out.println("Sportivul nu are salariu.");
        }
    }



}
//tema
//masini - in functie de anul din care face parte masina, sa calculam un impozit
//prezentare masina
//in functie de km, masina e mai veche
//4-5 masini
//2 constructori
