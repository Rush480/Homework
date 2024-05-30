package Module8;

public class Quad extends Shape{
    private double side;

    public Quad(double side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "Quad";
    }
}
