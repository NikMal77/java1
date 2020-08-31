package lessons.lesson8.unit8_3;

import java.util.Arrays;

public class DemoNestedFromOtherClass {
    public static void main(String[] args) {
        NestedFigures.Segment segment = new NestedFigures.Segment(5);
        NestedFigures.Square square = new NestedFigures.Square(5);
        NestedFigures.Rectangle rectangle = new NestedFigures.Rectangle(5, 11);
        NestedFigures.Circle circle = new NestedFigures.Circle(5);
        NestedFigures.Triangle triangle = new NestedFigures.Triangle(3, 4, 5);

        NestedFigures.Figure[] figures = {segment, square, rectangle, circle, triangle};

        Arrays.sort(figures);

        for (var figure : figures) {
            NestedFigures.printInfo(figure);
        }
    }
}
