import java.util.*;
public class Sumofnaturalno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(i<=a){
            sum = sum + i;
            // i=i+1;
            // System.out.print(sum);
            i=i+1;

        }
         System.out.print(sum);
    }
}