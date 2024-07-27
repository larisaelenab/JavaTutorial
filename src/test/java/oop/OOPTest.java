package oop;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

public class OOPTest {

    @Test
    public void metodaTest(){
        //dam o comanda de masina Dacia

        List<String> echipamenteLogan = Arrays.asList("pachet tehno", "pachet clima", "pachet parking");
        List<String> accesoriiLogan = Arrays.asList("covorase", "scrumiera", "suport pahare");

        DaciaConfigurator Logan = new DaciaConfigurator("Dacia", "Logan", 2024, "Essential", "TCe 90 MT6",
                "alb", "otel 16", "expression", echipamenteLogan, accesoriiLogan);
        Logan.infoDacia();
        Logan.pornesteMotorul();
        Logan.deschidereGeam();
        Logan.promotieDacia();
        Logan.promotieDacia("rabla");
        Logan.promotieDacia(25);

        System.out.println("-------------");

      //dam o comanda de masina Volkswagen
//       List<String> optionalePolo = Arrays.asList("pachet confort", "trapa", "alarma antifurt");
//       VolkswagenConfigurator Polo = new VolkswagenConfigurator("Volkswagen", "Polo", 2024,
//               "Advanced", "Life 1.0", "gri", "otel 15", "stofa", optionalePolo);
//       Polo.infoVolkswagen();
    }
}


