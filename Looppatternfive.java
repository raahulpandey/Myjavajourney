import java.util.*;
public class Looppatternfive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            // int b=sc.nextInt();
            for(int i=1;i<=a;i++){
                for(int j=1;j<=a-i;j++){
                     System.out.print(" ");
                    
                }
                for(int k=1;k<=i;k++){
                     System.out.print("*");
               

            }
             System.out.println("");      
        }
    }
} 