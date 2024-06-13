package tema;

import org.testng.annotations.Test;

public class Homework1 {
    String helloWorld;
    Integer varsta;
    String nume;
    String prenume;
    Character salut;
    Character hello;
    Character vocalaZ;
    String propozitie = "Poti pleca acasa dupa ce iti verific munca!";
    Double salariu;
    String prenumeAngajat;
    Integer idAngajat;
    String departament;
    String numeAngajat;
    Integer nrDepartament;

    @Test
    public void metodaTest(){
        printHello();
        detaliiDespreMine();
        salutM();
        hello();
        fructeZ();
        salariuAngajat();
        idDepartamentAngajat();
        afisareNrDepartament();
        rezultatEcuatie();

    }

    public void printHello(){
        helloWorld = "Hello World";
        System.out.println(helloWorld);
        System.out.println(propozitie);
    }

    public void detaliiDespreMine(){
        varsta = 34;
        nume = "Buleu";
        prenume = "Larisa";
        System.out.println("Varsta mea este: "+varsta);
        System.out.println(propozitie);
        System.out.println("Numele meu este: "+nume);
        System.out.println("Prenumele meu este: "+prenume);
        System.out.println(propozitie);
    }

    public void salutM(){
        salut = 'M';
        System.out.println("Salut, "+salut+"!");
        System.out.println(propozitie);
    }

    public void hello(){
        hello = 'H';
        System.out.println(hello+"ello");
        System.out.println(propozitie);
    }

    public void fructeZ(){
        vocalaZ = 'Z';
        System.out.println("Ana"+vocalaZ+" are"+vocalaZ+" mere"+vocalaZ+", pere"+vocalaZ+", prune"+vocalaZ+".");
        System.out.println(propozitie);
    }

    public void salariuAngajat(){
        salariu = 10058.25;
        prenumeAngajat = "Andrei";
        if (prenumeAngajat.equals("Andrei")){
            System.out.println("Salariul lui Andrei este: "+salariu+"lei");
        }
    }

    public void idDepartamentAngajat(){
        idAngajat = 256;
        departament = "IT";
        numeAngajat = "Popescu";
        if (numeAngajat.equals("Popescu")){
            System.out.println("Angajatul Popescu are id-ul "+idAngajat+" si face parte din departamentul "+departament+".");
        }
    }

    public void afisareNrDepartament(){
        nrDepartament = 899;
        departament = "HR";
        if (nrDepartament>287){
            System.out.println("Numarul departamentului de "+departament+" este "+nrDepartament+".");
        }
    }

    public void rezultatEcuatie(){
        Integer a = 2;
        Float b = 3f;
        Integer c = 4;
        Float d = b*c;
        Float e = a+d-b;
        Float f = (Float) e/(Float) b;
        System.out.println("Rezultatul corect este "+f+".");
    }
}
