
import java.util.Scanner;

public class pattern1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            if (i > 10) {
                System.out.printf("%d      X      %d      =      %d\n", n, i, n * i);
            } 
            else {
                System.out.printf("%d      X      %d      =     %d\n", n, i, n * i);
            }

        }
    }
}

// for (int j = 1; j <= 5; j++) {
//     System.out.print(j);
// }
