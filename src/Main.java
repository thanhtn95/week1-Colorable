import Interface.Colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Rectangle();
        shapes[3] = new Circle();
        shapes[4] = new Square();

        for (Shape s : shapes) {
            if (s instanceof Colorable) {
                ((Square) s).howToColor();
            } else if (s instanceof Circle) {
                System.out.println("Area: " + ((Circle) s).getArea());
            } else System.out.println("Area: " + ((Rectangle) s).getArea());
        }
    }
}
