
import java.util.Scanner;

public class mul_func {
    public static int product(int a, int b) {
        int pro=a*b;
        return pro;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int pro=product(a,b);
        System.out.println(pro);

    }
}
