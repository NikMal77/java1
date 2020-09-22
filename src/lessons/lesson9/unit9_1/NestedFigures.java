package lessons.lesson9.unit9_1;

import java.util.Arrays;

public class NestedFigures {
    // вложенные классы-фигуры
    public abstract static class Figure implements Comparable<Figure> {
        @Override
        public int compareTo(Figure figure){
            return Double.compare(this.area(), figure.area());
        }

        // периметр фигуры
        abstract double perimeter();

        // площадь фигуры
        double area(){
            return 0d;
        }
    }

    public static class Segment extends Figure{
        double a;

        Segment(double a){
            this.a = a;
        }

        @Override
        double perimeter(){
            return a;
        }

        @Override
        public String toString(){
            return "Отрезок, длина " + a;
        }
    }

    public static class Square extends Segment {
        Square(double a){
            super(a);
        }

        @Override
        double area(){
            return a * a;
        }

        @Override
        double perimeter(){
            return 4 * a;
        }

        @Override
        public String toString(){
            return "Квадрат " + a + " x " + a;
        }
    }

    public static class Rectangle extends Square {
        double b;

        Rectangle(double a, double b) {
            super(a);
            this.b = b;
        }

        @Override
        double area() {
            return a * b;
        }

        @Override
        double perimeter() {
            return 2 * (a + b);
        }

        @Override
        public String toString() {
            return "Прямоугольник " + a + " x " + b;
        }
    }

    public static class Circle extends Figure {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }

        @Override
        double perimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString() {
            return "Окружность с радиусом " + radius;
        }
    }

    public static class Triangle extends Segment {
        double b;
        double c;

        Triangle(double a, double b, double c){
            super(a);
            this.b = b;
            this.c = c;
        }

        @Override
        double area(){
            double hP = perimeter() / 2;
            return Math.sqrt(hP * (hP - a) * (hP - b) * (hP - c));
        }

        @Override
        double perimeter(){
            return a + b + c;
        }

        @Override
        public String toString(){
            return "Треугольник со сторонами " + a + ", " + b + ", " + c;
        }
    }

    // статические методы
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

        for (var figure : figures) {
            printInfo(figure);
        }
    }
}
