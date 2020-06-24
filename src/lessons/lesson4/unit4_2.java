package lessons.lesson4;

public class unit4_2 {
    public static void main(String[] args) {
        System.out.println(textGrade(101));
    }
    static String textGrade(int grade){
        if (grade == 0)
            return "не оценено";
        else if (grade >= 1 && grade <= 20)
            return "очень плохо";
        else if (grade >= 21 && grade <= 40)
            return "плохо";
        else if (grade >= 41 && grade <= 60)
            return "удовлетворительно";
        else if (grade >= 61 && grade <= 80)
            return "хорошо";
        else if (grade >= 81 && grade <= 100)
            return "отлично";
        else
            return "не определено";
    }
}
