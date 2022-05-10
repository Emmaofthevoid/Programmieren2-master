package atCampus02.zam.ss2022.LogisticManager;

import java.util.ArrayList;

public class LogisticManager {

    ArrayList<Moveable> list;

    public LogisticManager() {
        list = new ArrayList<>();
    }

    public void moveAll(String destination) {
        for (Moveable m : list) {
            m.move(destination);
        }
    }
}
