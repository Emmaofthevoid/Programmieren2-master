package atCampus02.zam.ss2022.LogisticManager;

public class ManagerApp  {
    public static void main(String[] args) {

        LogisticManager logman = new LogisticManager();

        logman.list.add(new Shirt("Gucci", "XXL", "Blau"));
        logman.list.add(new Car("Mercedes Puch G", "military green (fui)", 666));

        logman.moveAll("to the hills");

    }



}
