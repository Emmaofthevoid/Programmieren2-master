package atCampus02.zam.ss2022.Vererbung.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DogParty {
    public static void main(String[] args) {
        //first constructor with parameters
        Dog scooby = new Dog("Scooby Doo", "Black", 40, true);

        System.out.println(scooby);

        scooby.bark();
        // second constructor without parameters
        // Dog hund = new Dog();
        System.out.println("**");
        // hund.bark();
        // new Beagle that inherited methods and attributs from the Parent Class Dog
        Beagle max = new Beagle("Hansi", "blue", 80, true, "Germknödel");
        System.out.println("**");
        System.out.println(max);

        Dog snoopy = new Dog("Snoopy", "white", 20, true);
        Dog snoopy2 = new Dog("Snoopy", "white", 40, true);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(scooby);
        dogs.add(max);
        dogs.add(snoopy);
        dogs.add(snoopy2);

        System.out.println(dogs);
        Collections.sort(dogs);

        System.out.println(dogs);

        Dog[] dogArr = {new Dog("manolito", "green", 30, true),
                new Beagle("Beagle", "blue", 19, true, "Spaghetti"),
                new Dog("Hansi", "turquoise", 90, false)};

        System.out.println(Arrays.toString(dogArr));
        Arrays.sort(dogArr);
        System.out.println(Arrays.toString(dogArr));


    }

}
