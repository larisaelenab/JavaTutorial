package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //structuri alternative: IF..THEN..ELSE/ SWITCH..CASE


    @Test
    public void metodaTest() {
        //verificNrMaiMare();
        //verificNrMaiMareV2(11);
        //verificNrMaiMareV2(8);
        //verificNrPar(2);
        //verificNrPar(3);
        //verificNrPar(0);
        //verificNrPar(-1);
        //verificNrPar(1598625);
        //verificNrPar(-4);
        zileSaptamana(5);


    }

    //verificam daca un numar este >10

    public void verificNrMaiMare() {
        if (15 > 10) {
            System.out.println("Numarul 15 este mai mare ca 10");
        } else {
            System.out.println("Numarul 15 nu este mai mare ca 10");
        }
    }

    //verificam daca un numar este >10 - V2

    public void verificNrMaiMareV2(Integer numar) {
        if (numar > 10) {
            System.out.println("Numarul " + numar + " este mai mare ca 10");
        } else {
            System.out.println("Numarul " + numar + " nu este mai mare ca 10");
        }

    }

    //verificam daca un numar este par si pozitiv
    public void verificNrPar(Integer nr) {
        //daca vrem sa luam catul impartirii = / (inseamna divide)
        //daca vrem sa luam restul impartirii = % (inseamna modulo)
        if (nr > 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul " + nr + " este par si pozitiv");
            } else {
                System.out.println("Numarul " + nr + " este impar si pozitiv");
            }
        } else if (nr < 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul " + nr + " este par si negativ");
            } else {
                System.out.println("Numarul " + nr + " este impar si negativ");
            }
        } else {
            System.out.println("Numarul este egal cu zero");
        }
    }

    //definim zilele saptamanii
    public void zileSaptamana(Integer zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi este Luni.");
                break;
            case 2:
                System.out.println("Astazi este Marti.");
                break;
            case 3:
                System.out.println("Astazi este Miercuri.");
                break;
            case 4:
                System.out.println("Astazi este Joi.");
                break;
            case 5:
                System.out.println("Astazi este Vineri.");
                break;
            default:
                System.out.println("S-au terminat zilele!");
        }
    }


}
