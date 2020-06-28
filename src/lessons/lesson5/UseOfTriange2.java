package lessons.lesson5;

class Triangle2 {
    // свойства
    double a, b, c;

    // конструктор ()
    // использование ключевого слова this
    // если имена свойств класса и параметров конструктора совпадают,
    // тогда в конструкторе для обращения к свойствам класса прмиеняется this.
    public Triangle2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // слово this прменяется при создании нескольких конструкторов

    // методы
    public double perimeter(){
        return a + b + c;
    }

    public double area(){
        // считаем по формуле Герона
        double hP = perimeter() / 2;
        return Math.sqrt(hP * (hP - a) * (hP - b) * (hP - c));
    }
}

public class UseOfTriange2{
    public static void main(String[] args) {
        Triangle2 tr1 = new Triangle2(3, 4, 5);
        Triangle2 tr2 = new Triangle2(5, 5, 5);
        Triangle2 tr3 = new Triangle2(5, 3, 5);

        System.out.println("Периметр треугольника 1 = " + tr1.perimeter());
        System.out.println("Площадь треугольника 1 = " + tr1.area());

        System.out.println("Периметр треугольника 2 = " + tr2.perimeter());
        System.out.println("Площадь треугольника 2 = " + tr2.area());

        System.out.println("Периметр треугольника 3 = " + tr3.perimeter());
        System.out.println("Площадь треугольника 3 = " + tr3.area());
    }
}
