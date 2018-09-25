class Car { /* This is a class-level variable. It's initialized
     * when the class is invoked, and it always usable
     * from instances of that class
     */

    public String owner;
    public String model;
    public String color;
    public int yearModel;

    /* This is a class "constructor", used to get
     * new copies. You've seen this with String(),
     * Integer(), and a couple of others
     */
    Car() {
    }

    Car(String owner, String model, String color, int yearModel) { 
        this.owner = owner;
        this.model = model;
        this.color = color;
        this.yearModel = yearModel;
    }

    public String toString() {
        return String.format("%s owns a %s %s made in %d",
                owner,
                color,
                model,
                yearModel
                );
    }
}

public class CustomToString {
    public static void main(String[] args) {
        Car c = new Car("Ryan", "Passat", "white", 2016);
        System.out.println(c);
    }
}
