public class Pattern9 {
    public static void main(String[] args){
        int n =5;
        for(int row=1;row<=n;row++){
            for(int spaces=1;spaces<=row;spaces++){
                System.out.print("  ");
            }
            for(int cols=n;cols>=row;cols--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
