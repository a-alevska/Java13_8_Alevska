public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Ellipse ellipse = new Ellipse();
        Quad quad = new Quad();
        Rhombus rhombus = new Rhombus();
        Triangle triangle = new Triangle();
        NamePrinter namePrinter = new NamePrinter();

        namePrinter.printName(circle);
        namePrinter.printName(ellipse);
        namePrinter.printName(quad);
        namePrinter.printName(rhombus);
        namePrinter.printName(triangle);
    }
}