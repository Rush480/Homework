package Module8;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Rectangle rectangle = new Rectangle(2,7);
        Pentagon pentagon = new Pentagon(3);
        Quad quad = new Quad(2);
        Triangle triangle = new Triangle(2,5,7);
        ShapeNamePrinter printer = new ShapeNamePrinter();

        printer.printShapeName(circle);
        printer.printShapeName(pentagon);
    }
}