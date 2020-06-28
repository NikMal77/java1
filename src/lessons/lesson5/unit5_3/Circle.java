package lessons.lesson5.unit5_3;

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
}
