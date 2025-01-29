
import java.util.*;
public class Circumgerenceofcircle {
    public static float circumference(float a){
     float product=(float) (2*3.14*a);
     return product;
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
float n = sc.nextInt();
float product=circumference(n);
System.out.print(product);
    }
}