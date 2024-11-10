
import java.util.Scanner;

public class fact_func {
    public static int fact(int n) {
        int factorial=1;
        for(int i=n;i>=1;i--){
             factorial=factorial*i;
        }
return factorial;        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n=sc.nextInt();
        int factorial=fact(n);
        System.out.println(factorial);
    }
}
