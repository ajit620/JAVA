import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        double num1=sc.nextDouble();
        System.out.println("enter the Second number:");
        double num2=sc.nextDouble();
        double sum= num1+num2;
        System.out.println("The sum is : " +sum);
        System.out.println("enter");
        sc.close();
    }
}
