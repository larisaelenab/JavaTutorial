package structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //structuri repetitive = FOR, WHILE, FOR EACH

    @Test
    public void metodaTest(){
        //afisareNrFor();
        //afisareNrWhile();
        nrPareInterval();
    }

    //afisam numerele pana la 15
    public void afisareNrFor(){
        for (Integer index=0; index<=15; index++){
            System.out.println(index);
        }
    }

    public void afisareNrWhile(){
        Integer index=0;
        while (index<=15){
            System.out.println(index);
            index++;
        }
    }


    //afisam nr pare de la 0 la 20
    public void nrPareInterval(){
        for (Integer index = 0; index <=20; index++){
            if (index % 2==0){
                System.out.println("Numarul "+index+ " este par.");
                }
            else{
                System.out.println("Numarul "+index+ " este impar.");
            }
        }
    }
}
