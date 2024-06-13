package obiect;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelefonTest {

    @Test
    public void metodaTest(){
        System.out.println("-----------TELEFON: IPHONE15-------------");
        Map<String, String> specificatiiIphone15= new HashMap<>();
        specificatiiIphone15.put("Tip telefon", "Smartphone");
        specificatiiIphone15.put("Sloturi SIM", "Dual SIM");
        specificatiiIphone15.put("Sistem de operare", "iOS");
        specificatiiIphone15.put("Model procesor", "Apple A15 Bionic");
        specificatiiIphone15.put("Dimensiuni", "71.5 x 7.65 x 146.7 mm");
        specificatiiIphone15.put("Memorie interna", "128 GB");

        List<String> accesoriiIphone15=new ArrayList<>();
        accesoriiIphone15.add("Cablu USB-C - Lightning");
        accesoriiIphone15.add("Casti");
        accesoriiIphone15.add("Incarcator");
        accesoriiIphone15.add("Stickere");

        Telefon Iphone15 = new Telefon("iphone", "15", "negru", "4 GB",
                1200, specificatiiIphone15, accesoriiIphone15, false);
        //Iphone15.infoTelefon();

        System.out.println("-----------TELEFON: SAMSUNG-------------");
        Map<String, String> specificatiiSamsung= new HashMap<>();
        specificatiiSamsung.put("Tip telefon", "Smartphone");
        specificatiiSamsung.put("Sloturi SIM", "Dual SIM");
        specificatiiSamsung.put("Sistem de operare", "Android");
        specificatiiSamsung.put("Model procesor", "Exynos 1280");
        specificatiiSamsung.put("Dimensiuni", "76.5 x 8.3 x 161 mm");
        specificatiiSamsung.put("Memorie interna", "128 GB");

        List<String> accesoriiSamsung=new ArrayList<>();
        accesoriiSamsung.add("Telefon");
        accesoriiSamsung.add("Casti");
        accesoriiSamsung.add("Incarcator");

        Telefon Samsung = new Telefon("Samsung", "Galaxy A25", "albastru", "6 GB",
                1300, specificatiiSamsung, accesoriiSamsung, false);
        Samsung.infoTelefon();


        System.out.println("-----------TELEFON: HUAWEI-------------");
        Map<String, String> specificatiiHuawei= new HashMap<>();
        specificatiiHuawei.put("Tip telefon", "Smartphone");
        specificatiiHuawei.put("Sloturi SIM", "Dual SIM");
        specificatiiHuawei.put("Sistem de operare", "Android");
        specificatiiHuawei.put("Model procesor", "Exynos 1280");


        List<String> accesoriiHuawei=new ArrayList<>();
        accesoriiHuawei.add("Telefon");
        accesoriiHuawei.add("Casti");

        Telefon Huawei = new Telefon("Huawei", "P30 Pro", "roz", "6 GB",
                900, specificatiiHuawei, accesoriiHuawei, true,
                "Produs cu urme fine de utilizare, ambalaj in stare buna, zgarieturi fine ecran, zgarieturi fine muchie");
        Huawei.infoTelefon();



    }
}
