import java.util.*;
public class Looppatterneight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int s=1;
            // int b=sc.nextInt();
            for(int i=1;i<=a;i++){
                for(int j=1;j<i;j++){
                    
                     System.out.print(s);
                    s++;
                }
             System.out.println("");      
        }
    }
} 