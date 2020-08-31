package lessons.lesson8.unit8_2;

import java.util.Objects;

public final class Rectangle extends Square {
    double b;

    Rectangle(double a, double b){
        super(a);
        this.b = b;
    }

    @Override
    double area(){
        return a * b;
    }

    @Override
    double perimeter(){
        return 2 * (a + b);
    }

    @Override
    public String toString(){
        return "Прямоугольник " + a + " x " + b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(b);
    }
}
