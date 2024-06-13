package obiect;

import org.testng.annotations.Test;

import java.util.concurrent.atomic.AtomicLongArray;

public class SportivTest {


    @Test
    public void metodaTest(){

        //instantiem un obiect de tipul sportiv
        Sportivi Ionut = new Sportivi("Popescu", "Ionut", 17, "masculin", "baschet", true);
        Ionut.prezentareSportiv();
        Ionut.verificareVarsta();
        Ionut.varsta = 18;
        Ionut.tipSport = "fotbal";
        Ionut.prezentareSportiv();
        Ionut.verificareVarsta();
        Ionut.marireSalariu(10);


        System.out.println("--------");

        Sportivi Marin = new Sportivi("Ionescu", "Marin", 55, "masculin", "box", false);
        Marin.prezentareSportiv();
        Marin.verificareVarsta();

        System.out.println("--------");

        Sportivi Larisa = new Sportivi("Buleu", "Larisa", 34, "feminin", "volei", true, 100000);
        Larisa.prezentareSportiv();
        Larisa.verificareVarsta();
        Larisa.marireSalariu(10);

    }

}
