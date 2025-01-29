import java.util.*;
public class Evenoddfun {
    public static int  Oddeven(int n){
        if(n%2==0){
            return 0;
        }
        else{
            return 1;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result=(Oddeven(n));
        if(result==0){
            System.out.print("even number");
        }
        else{
            System.out.print("odd number");
        }


    }
}