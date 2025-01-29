import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char c = sc.next().charAt(0);
        double result;
        switch (c) {
            case '+' -> {
                result=a+b;
                System.out.println(result);
            }
             case '-' -> {
                 result=a-b;
                 System.out.println(result);
            }
             case '*' -> {
                 result=a*b;
                 System.out.println(result);
            }
             case '/' -> {
                 result=a/b;
                 System.out.println(result);
            }
            default -> System.out.println("invalid operator");
        }
        
    }
}
