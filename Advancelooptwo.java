import java.util.*;
public class Advancelooptwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            // int b=sc.nextInt();
            for(int i=1;i<=a;i++){
                for(int j=0;j<=a-i+1;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<=a;j++){
                    System.out.print("*");
                }
             
             System.out.println("");      
        }
    }
} 