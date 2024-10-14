
import java.util.*;

public class first {

    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your Age");
        int n = in.nextInt();
        if (n > 18) 
        {
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }

}
