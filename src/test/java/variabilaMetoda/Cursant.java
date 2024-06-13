package variabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {

    //asta e un comentariu

    //recunoastem o clasa intr-un fisier java dupa cuvantul cheie class
    //intr-un fisier java putem avea o multime de clase pe care le diferentiem prin numele lor
    //nu este un practice bun in java sa avem intr-un fisier mai multe clase
    //in fiecare clasa trebuie sa definim un nume
    //intelegem printr-o clasa ca fiind un sablon specific din viata reala
    //intr-o clasa putem defini variabile si metode

    //variabila = proprietatea (atributul) unei clase
    //intr-o clasa putem avea o multime de variabile
    //variabilele se diferentiaza prin tip si nume
    //variabilele pot sa fie de 2 feluri: global si local
    //v globala = prop vizibila oriunde in cod
    //v locala = prop vizibila doar in locul definit

    //tipuri de date: string, integer, double/float (nr cu zecimale), character, boolean

    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;

    //metoda = actiunea unei clase
    //intr-o clasa putem avea o multime de metode diferentiate prin numele acestora
    //exista 2 tipuri de metode: void si return
    //metoda void = actiune pe care vrem sa o afisam/ interpretam fara a fi nevoie sa o returnam
    //pentru o metoda trebuie sa specificam un access control (public), (), si {}

    @Test
    public void metodaTest () {
       descrieCursant();
       primesteBursa();
    }

    public void primesteBursa () {
        Integer bursa = 1000;
        System.out.println("Bursa cursantului este " + bursa);

    }

    public void descrieCursant () {
        nume = "Buleu";
        prenume = "Larisa";
        varsta = 34;
        adresa = "Sos. Mihai-Bravu, nr. 12";
        inaltime = 1.60;
        greutate = 54.3f;
        sex = 'F';
        areRestante = true;

        //System.out.print(nume);
        //System.out.print(prenume);
        //System.out.print(varsta);

        // System.out.print(nume + prenume + varsta);    //concatenare

        System.out.println("Numele cursantului este: " + nume);
        System.out.println("Prenumele cursantului este: " + prenume);
        System.out.println("Varsta cursantului este: " + varsta + " de ani");
        System.out.println("Adresa cursantului este: " + adresa);
        System.out.println("Inaltimea cursantului este: " + inaltime);
        System.out.println("Greutatea cursantului este: " + greutate + "kg");
        System.out.println("Sexul cursantului este: " + sex);
        System.out.println("Cursantul are restante? " + areRestante);
    }




}
