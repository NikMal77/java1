package lessons.lesson8.unit8_2;

import java.util.Arrays;

public class Figures {
    public static void printInfo(Figure figure){
        System.out.println(figure);
        System.out.println("    периметр " + figure.perimeter());
        System.out.println("    площадь  " + figure.area());
        System.out.println("");
    }

    public static void main(String[] args) {
        Segment segment = new Segment(5);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 11);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 4, 5);

        Figure[] figures = {segment, square, rectangle, circle, triangle};

        Arrays.sort(figures);

        for (var figure: figures){
            printInfo(figure);
        }

//        System.out.println("segment.compareArea(square)        = " + segment.compareArea(square));
//        System.out.println("square.compareArea(square)         = " + square.compareArea(square));
//        System.out.println("square.compareArea(rectangle)      = " + square.compareArea(rectangle));
//        System.out.println("circle.compareArea(triangle)       = " + circle.compareArea(triangle));
//        System.out.println("rectangle.compareArea(triangle)    = " + rectangle.compareArea(triangle));

//        System.out.println("segment.compareArea(square)        = " + segment.compareTo(square));
//        System.out.println("square.compareArea(square)         = " + square.compareTo(square));
//        System.out.println("square.compareArea(rectangle)      = " + square.compareTo(rectangle));
//        System.out.println("circle.compareArea(triangle)       = " + circle.compareTo(triangle));
//        System.out.println("rectangle.compareArea(triangle)    = " + rectangle.compareTo(triangle));
    }
}
