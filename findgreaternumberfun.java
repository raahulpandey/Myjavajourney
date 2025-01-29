import java.util.*;
public class findgreaternumberfun {
    public static int greaternumber(int a ,int b){
      if(a > b){
        System.out.print("The greatest number is a: ");
        return a;
      }
      else if(b>a){
        System.out.print("the greatest number is b:: ");
        return b;
      }
      else{
        System.out.print("both  a and b are equal");
      }
        return 0;
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
int m=sc.nextInt();
int greater=greaternumber(n,m);
System.out.print(greater);
    }
}