
import java.util.*;

public class loop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the loop limit\n ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("\n"+i + " :");
            System.out.println("java is great");
            if (i == 4) {

                System.out.println("\nending the loop here itself !!\n");
                break;

            }
        }
    }
}
