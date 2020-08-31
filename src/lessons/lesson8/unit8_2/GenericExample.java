package lessons.lesson8.unit8_2;

public class GenericExample<T> {
    T object;

    public GenericExample(T object){
        this.object = object;
    }

    public String getObjectInfo(){
        return object.getClass().getName();
    }

    public static void main (String[] args){
        System.out.println(new GenericExample<Integer>(5).getObjectInfo());
        System.out.println(new GenericExample<String>("Строка").getObjectInfo());
        System.out.println(new GenericExample<Double>(5.0).getObjectInfo());
    }
}
