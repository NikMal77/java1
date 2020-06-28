package lessons.lesson5;

class Triangle1 {
    // свойства
    double a, b, c;

    // конструктор ()
    // 1. Конструктор это особый метод, создающий экземпляр класса (у такого метода нет типа возвращаемого значения)
    // 2. Имя конструктора обязательно совпадает с именем класса
    // 3. Допускается любое количество когструкторов внутри одного класса
    // 4. Если конструктор не описан, то компилятор создаст конструктор по умолчанию (без параметров и тела)
    public Triangle1(double side_a, double side_b, double side_c){
        a = side_a;
        b = side_b;
        c = side_c;
    }

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

public class UseOfTriange1{
    public static void main(String[] args) {
        Triangle1 tr1 = new Triangle1(3, 4, 5);
        Triangle1 tr2 = new Triangle1(5, 5, 5);
        Triangle1 tr3 = new Triangle1(5, 3, 5);

        System.out.println("Периметр треугольника 1 = " + tr1.perimeter());
        System.out.println("Площадь треугольника 1 = " + tr1.area());

        System.out.println("Периметр треугольника 2 = " + tr2.perimeter());
        System.out.println("Площадь треугольника 2 = " + tr2.area());

        System.out.println("Периметр треугольника 3 = " + tr3.perimeter());
        System.out.println("Площадь треугольника 3 = " + tr3.area());
    }
}
