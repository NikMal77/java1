package lessons.lesson6.unit6_2;

public class Test6_2 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(2.0, 2.0);
        Rectangle rec2 = new Rectangle(3.0, 3.0);
        System.out.println(rec1.compareTo(rec2));
    }

    static class Rectangle{
        private double a;
        private double b;

        public Rectangle(double a, double b){
            this.a = a;
            this.b = b;
        }

        public double area(){
            return a * b;
        }

        public int compareTo(Rectangle anRectangle){
            if (this.area() > anRectangle.area()) return 1;
            else if (this.area() == anRectangle.area()) return 0;
            else return -1;
        }
    }
}
