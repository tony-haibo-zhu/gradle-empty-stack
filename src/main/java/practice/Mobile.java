package practice;

public class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile() {

    }

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public String call(String msg) {
        return String.format("Message : %s", msg);
    }

    public String detail() {
        return String.format("name: [%s], color: [%s], brand: [%s]",
                name, color, brand);
    }
}
