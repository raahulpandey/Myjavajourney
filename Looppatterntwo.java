//import java.util.*;
public class Looppatterntwo {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
            // int a=sc.nextInt();
            // int b=sc.nextInt();
            int a=4;
            int b=5;
            for(int i=1;i<=a;i++){
                for(int j=1;j<=b;j++){
                    if(i==1 || j==1 || i==a || j==b) {
                        System.out.print("*");
                    }
                    else{
                      System.out.print(" ");  
                    }
                    
                }
                System.out.println("");

            }
        
    }
} 