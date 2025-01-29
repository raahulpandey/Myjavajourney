import java.util.*;
public class Multiplyfunction {
    public static int Product(int a,int b){
        int multiply=a*b;
        return multiply;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int productt = Product(a,b);
        System.out.print(productt);
    
    }
}