import java.util.*;
public class Averagesumfun {
    public static int Averagefun(int a, int b, int c){
        int averagesum = (a+b+c)/3;
        return averagesum;
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a = sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();
int average=Averagefun(a,b,c);
System.out.print(average);
    }
}