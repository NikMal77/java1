package lessons.lesson5;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.set(25);

        System.out.println(calculator.add(10));
        System.out.println(calculator.sub(5));

    }
}

class Calculator{
    private int result;

    Calculator(){
        result = 0;
    }

    public int set(int num){
        return result = num;
    }
    public int add(int num){
        return result += num;
    }
    public int sub(int num){
        return result -= num;
    }
    public int getResult(){
        return result;
    }
}
