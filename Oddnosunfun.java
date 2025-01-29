import java.util.*;
public class Oddnosunfun {
    public static int Oddsum(int a){
       int sum=0;
       for(int i=1;i<=a;i++){
        if(i%2!=0){
            sum=sum+i;
        }
       }
       return sum;
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
int sum=Oddsum(n);
System.out.print(sum);
    }
}