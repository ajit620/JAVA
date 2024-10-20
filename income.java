
import java.util.*;

public class income {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int profit=0,loss=0;
        System.out.println("enter the cost price");
        int cp=sc.nextInt();
        System.out.println("enter the selling price");
        int sp=sc.nextInt();
        if(cp>sp){
            loss=cp-sp;
            System.out.print("seller made a loss of ");
            System.out.println(loss);
        }
        else{
            profit=sp-cp;
            System.out.print("seller made a profit of ");
            System.out.println(profit);
        }
    }
}

