package tema;

import org.testng.annotations.Test;

public class Homework2 {

        @Test
        public void metodaTest(){
            System.out.println("DA"+" DA"+" DA"+" DA"+" DA");
            afisareTreiNumere();
            afisareNrMare(15, 20);
            afisareNrMic(4.5, 3.25);
            afisareNrPareSiImpare();
            afisareNrPare();
            afisareNrDivizibileCu5(10);
            afisarePrimele3NrDivizibileCu5();
            sumaDouaNr();
            sumaZeceNr();
            produsCinciNr();
        }

        public void afisareTreiNumere(){
            for (Integer index=1; index<=3; index++){
                System.out.println(index);
            }
        }

        public void afisareNrMare(Integer a, Integer b){
            if (a>b){
                System.out.println(a);
            }
            else {
                System.out.println(b);
            }
        }

        public void afisareNrMic(Double a, Double b){
            if (a<b){
                System.out.println(a);
            }
            else {
                System.out.println(b);
            }
        }

        public void afisareNrPareSiImpare(){
            for (Integer index=0; index<=10; index++){
                if (index % 2 ==0){
                    System.out.println("Numarul "+index+" este par.");
                }
                else {
                    System.out.println("Numarul "+index+" este impar.");
                }
            }

        }

        public void afisareNrPare() {
            for (Integer index = 0; index <= 10; index++) {
                if (index % 2 == 0) {
                    System.out.println("Numarul " + index + " este par.");
                }
            }
        }

        public void afisareNrDivizibileCu5(Integer index){
            if (index%5==0){
                System.out.println("Numarul "+index+" este divizibil cu 5.");
            }
            else {
                System.out.println("Numarul "+index+" nu este divizibil cu 5.");
            }
        }
        public void afisarePrimele3NrDivizibileCu5(){
            for (Integer index=0;index<15;index++) {
                if (index%5==0){
                    System.out.println("Numarul "+index+" este divizibil cu 5.");
                }

            }

        }

        public void sumaDouaNr(){
            Integer x = 235;
            Integer y = 10;
            System.out.println(x+y);
        }

        public void sumaZeceNr(){
            Integer suma = 0;
            for (Integer i=0; i<=10; i++){
                suma=suma + i;
            }
            System.out.println(suma);
        }

        public void produsCinciNr(){
            Integer produs = 1;
            for (Integer i=1; i<=5; i++){
                produs=produs * i;
            }
            System.out.println(produs);
        }

    }


