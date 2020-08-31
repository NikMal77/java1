package lessons.lesson8.unit8_2;

import java.util.Objects;

public class Circle extends Figure {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Окружность с радиусом " + radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
