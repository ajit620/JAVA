
import java.util.Scanner;

public class string {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name="my name is [name]";
        // System.out.println("enter the  uppercase string to be converted into lowercase");
        // name=in.nextLine();
        // String lower_case= name.toLowerCase();
        // System.out.println(lower_case);
        // System.out.println("enter the string \n");
        // name = in.nextLine();
        System.out.println(name.replace("[name]","ajit panja"));
        
    }
}
