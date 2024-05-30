package Module8;

public class Pentagon extends Shape{
    private double sideLength;

    public Pentagon(double sideLength) {
        super("Pentagon");
        this.sideLength = sideLength;
    }

    @Override
    public String getName() {
        return "Pentagon";
    }
}
