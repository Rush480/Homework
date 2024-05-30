package Module8;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
