package atCampus02.zam.ss2022.Vererbung.Dog;

public class Dog implements Comparable<Dog> {
    public String name;
    public String eyeColor;
    public int weigth;
    public boolean appreciatesOthersDogs;

//    public Dog() {
//        this.name = "Hund";
//        this.eyeColor = "black";
//        this.weigth = 17;
//        this.appreciatesOthersDogs = true;
//    }

    public Dog(String name, String eyeColor, int weigth, boolean appreciatesOthersDogs) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.weigth = weigth;
        this.appreciatesOthersDogs = appreciatesOthersDogs;
    }

    public void bark() {
        System.out.println(name + " bellt ");
    }

    public void eat() {
        System.out.println(name + " eats ");
        bark();
    }

    @Override
    public String toString() {
        String text = null;
        if (appreciatesOthersDogs) {
            text = name + " admires other dogs with their sparkly " + eyeColor + " eyes ";
        } else {
            text = name + " barks until all dogs leave the park ";
        }
        return text;
    }

    //sort with two criteria
    //first criteria is his name and second his weight
    @Override
    public int compareTo(Dog o) {

        //first: name
        int ergFirst = this.name.compareTo(o.name);

        if (ergFirst != 0) {
            return ergFirst; //so we either have positive or negative value
        }

        //second: weight- only look at it if first criteria is undecided (0)
        if (this.weigth < o.weigth) {
            return -1;
        }

        if (this.weigth > o.weigth) {
            return 1;
        }
        return 0;
    }
}
