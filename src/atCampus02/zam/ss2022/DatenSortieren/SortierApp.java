package atCampus02.zam.ss2022.DatenSortieren;

import atCampus02.zam.ss2022.Vererbung.Customer.Person;
import atCampus02.zam.ss2022.Vererbung.Dog.Beagle;
import atCampus02.zam.ss2022.Vererbung.Dog.Dog;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortierApp {
    public static void main(String[] args) {
        int[] intArr = {27, -12, 4, 29, 34};
        String[] strArr = {"Hansis Erste Hits", "Hansis Beste", "Hansis Neuestes Album"};
        Mitarbeiter[] mrArr = {
                new Mitarbeiter("Hansi", "Hintersee", 1969),
                new Mitarbeiter("Manolito", "Caramierda", 1999),
                new Mitarbeiter("Eldar", "Of the Woods", 0000)};

        //Arrays.asList() to convert Array to list
        List<Mitarbeiter> mrList = new ArrayList<Mitarbeiter>();
        mrList.add(new Mitarbeiter("Hansi", "Hintersee", 1969));
        mrList.add(new Mitarbeiter("Manolito", "Caramierda", 1999));
        mrList.add(new Mitarbeiter("Eldar", "Of the Woods", 0000));


        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        //sortieren nach komplexe datentyp
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        System.out.println(Arrays.toString(mrArr));
        Arrays.sort(mrArr);  //error because we do not implement comparable interfaces
        System.out.println(Arrays.toString(mrArr));

        System.out.println("*******************");
        System.out.println(mrList);
        Collections.sort(mrList);
        System.out.println(mrList);

        //now with comparator

        Collections.sort(mrList, new ZunameComparator());

        System.out.println(mrList);


    }
}
