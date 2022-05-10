package atCampus02.zam.ss2022.LogisticManager;

public class Car implements Moveable {

    String type;
    String color;
    float weight;

    public Car(String type, String color, float weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void move(String destination) {
        System.out.println("The car " + type + " will be moved to Graz");
    }
}
