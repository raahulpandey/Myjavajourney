import java.util.*;
public class Advancepatternone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            // int b=sc.nextInt();
            for(int i=1;i<=a;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int k=1;k<=a-i;k++){
                    System.out.print(" ");
                }
                for(int l=1;l<=a-i;l++){
                    System.out.print(" ");
                }
                for(int m=1;m<=i;m++){
                    System.out.print("*");

                }
             System.out.println("");      
        }
        for(int i=a;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int k=1;k<=a-i;k++){
                    System.out.print(" ");
                }
                for(int l=1;l<=a-i;l++){
                    System.out.print(" ");
                }
                for(int m=1;m<=i;m++){
                    System.out.print("*");

                }
             System.out.println("");      
        }
    }
} 