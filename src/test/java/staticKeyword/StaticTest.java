package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void metodaTest(){
        Elev LarisaB = new Elev("Buleu", "Larisa", 16);
        LarisaB.prezentare();

        System.out.println("----------------------");

        Elev AlexB = new Elev("Buleu", "Alex", 18);
        AlexB.prezentare();
    }
}
