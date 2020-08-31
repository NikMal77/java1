package lessons.lesson8.unit8_2;

public abstract class Figure implements Comparable<Figure> {
//    @Override
//    public int compareArea(Figure figure){
//        return Double.compare(this.area(), figure.area());
//    }

    @Override
    public int compareTo(Figure o){
        return Double.compare(this.area(), o.area());
    }
    abstract double perimeter();

    double area(){
        return 0d;
    }
}
