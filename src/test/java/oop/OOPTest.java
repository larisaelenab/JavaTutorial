package oop;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OOPTest {

    @Test
    public void metodaTest(){
        //dam o comanda de masina Dacia

        List<String> echipamenteLogan = Arrays.asList("pachet tehno", "pachet clima", "pachet parking");
        List<String> accesoriiLogan = Arrays.asList("covorase", "scrumiera", "suport pahare");

        DaciaConfigurator Logan = new DaciaConfigurator("Dacia", "Logan", 2024, 23.568,
                25.336, "Essential", "TCe 90 MT6", "alb", "otel 16", "expression", echipamenteLogan,
                accesoriiLogan);
        Logan.infoDacia();

        System.out.println("-------------");

        //dam o comanda de masina Volkswagen
        List<String> optionalePolo = Arrays.asList("pachet confort", "trapa", "alarma antifurt");
        VolkswagenConfigurator Polo = new VolkswagenConfigurator("Volkswagen", "Polo", 2024, 55.2256, 73.256,
                "Advanced", "Life 1.0", "gri", "otel 15", "stofa", optionalePolo);
        Polo.infoVolkswagen();
    }
}


//mai definesc o dacie si 2 volkswagen
//mai aleg o marca de masina, fac o clasa si definesc 2 obiecte (ex: Audi)
