package valueReferenceType;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ValueReferenceTest {

    //Primitive: int, double, float, char, boolean, long -> lucram direct cu valoarea
    //Non-primitive (referinta): String, Object, Array

    //Static = o valoare care se pastreaza pentru toate instantele dintr-o clasa

    //Final = defineste o constanta care nu isi poate modifica valoarea initiala

    //Wrapper Class = constructie de clasa care este facuta pe baza unui tip de data primitiva (int -> Integer)

    public int originalInt = 10;
    public String originalString = "original";
    public Curs cursTestare = new Curs("cursul este despre testare automata", "Testare Automata", 25);
    public final int nrCursanti = 16;
    public Integer defaultWrapper;
    public int defaultPrimitive;

    @Test
    public void metodaTest(){
        System.out.println("1. VALUE TYPE");
        valueTypeExample(originalInt);
        System.out.println("Valoarea initiala este " + originalInt);

        System.out.println("2. REFERENCE TYPE STRING");
        referenceTypeStringExample(originalString);
        System.out.println("Valoarea initiala este " + originalString);

        System.out.println("3. REFERENCE TYPE OBJECT");
        referenceTypeObjectExample(cursTestare);
        System.out.println("Valoarea initiala este ");
        cursTestare.prezentareCurs();

        System.out.println("4. CONSTANT");
        //nrCursanti = nrCursanti + 10;

        System.out.println("5. VALUE TYPE/ WRAPPER CLASS");
        defaultValue();

    }


    public void valueTypeExample(int value){
        value = value + 5;
        System.out.println("Valoarea noua este " + value);
    }

    public void referenceTypeStringExample(String value){
        value = value + " orice";
        System.out.println("Valoarea noua este " + value);
    }

    public void referenceTypeObjectExample(Curs Object){
        Object.prezentareCurs();
        Object.setTitlu("Testare Manuala");
        Object.prezentareCurs();
    }

    public void defaultValue(){
        System.out.println(defaultWrapper);
        System.out.println(defaultPrimitive);

        int[] array = new int[5];
        Integer[] array1 = new Integer[5];
        List<Integer> list = new ArrayList<>();
        //List<int> list2 = new ArrayList<>();


    }

}
