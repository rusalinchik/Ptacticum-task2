import figures.Circle;
import figures.Figure;
import figures.Rectangle;
import figures.Triangle;

public class Main {

    public static void main(String[] args) {

        Figure rectangle = new Rectangle(5, 10);
        Figure circle = new Circle(7);
        Figure triangle = new Triangle(3, 4, 5);

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Triangle area: " + triangle.getArea());
    }
}
