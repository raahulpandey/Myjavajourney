import java.util.*;
public class Factorfunction {
    public static int Factorfun(int n){
        int product=1;
        for(int i=1;i<=n;i++){
            product=product*i;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(Factorfun(a));

    }
}