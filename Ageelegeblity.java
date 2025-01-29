import java.util.*;
public class Ageelegeblity {
    public static int Agecrateria(int a) {
        if(a>=18){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int eligiblity=Agecrateria(n);
        if(eligiblity==1){
            System.out.println("eligible for the vote");
        }
        else{
            System.out.println("not eligible for the vote");
        }
        }
    }