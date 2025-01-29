import java.util.*;
public class Condition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if(a >= 18){
            System.out.println("adult");
        }
        else{
            System.out.print("not adult");
        }
    }
}