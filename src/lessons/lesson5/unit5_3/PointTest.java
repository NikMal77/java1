package lessons.lesson5.unit5_3;

public class PointTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println(point3D.toString());
    }
}

class Point2D {
    int x;
    int y;

    Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return (x + "," + y);
    }
}

class Point3D extends Point2D {
    private int z;

    Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString(){
        return (x + "," + y + "," + z);
    }
}
