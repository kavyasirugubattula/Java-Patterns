import java.util.*;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int a = 2*n;
        for(int i=0;i<=a;i++){
            for(int j=0;j<=a;j++){
                int c=n-Math.min(Math.min(i,j),Math.min(a-i,a-j));
                System.out.print(c  + " ");
            }
            System.out.println();
        }   
    }
}
