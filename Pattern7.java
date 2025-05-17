import java.util.*;

public class Pattern7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =  sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int k=1;k<=n-row;k++){
                System.out.print(" ");
            }
            for(int cols=1;cols<=row;cols++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
