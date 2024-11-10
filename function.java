
import java.util.Scanner;

public class function {
    public static void printMyname(String name) {
        System.out.println(name);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("enter name");
        name=sc.next();
        printMyname(name);

    }
}
