package tema.obiect;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MasiniTest {

    @Test
    public void metodaTest(){
        System.out.println("-----------BMW-------------");
        Map<String, List<String>> dotariBMW=new HashMap<>();

        List<String> audioTehnologieBMW = new ArrayList<>();
        audioTehnologieBMW.add("Bluetooth");
        audioTehnologieBMW.add("Radio");
        audioTehnologieBMW.add("Sistem hands-free");
        audioTehnologieBMW.add("Port USB");

        List<String> confortBMW = new ArrayList<>();
        confortBMW.add("Climatronic");
        confortBMW.add("Tapiterie piele");
        confortBMW.add("Scaun sofer ajustabil electric");

        List<String> sigurantaBMW = new ArrayList<>();
        sigurantaBMW.add("ABS");
        sigurantaBMW.add("ESP");
        sigurantaBMW.add("Franare asistata");

        dotariBMW.put("Audio si tehnologie", audioTehnologieBMW);
        dotariBMW.put("Confort", confortBMW);
        dotariBMW.put("Siguranta", sigurantaBMW);


        Masini BMW = new Masini("BMW", "Seria 7", 37268f, 2018,
                "Diesel", 77500, false, dotariBMW, 1450);
        BMW.impozitMasinaCapacitateCilindrica();



    }
}
