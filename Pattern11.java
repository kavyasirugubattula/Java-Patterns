public class Pattern11 {
    public static void main(String[] args) {
        int a = 5;
        for(int row=1;row<=a;row++){
            for(int spaces=1;spaces<=a-row;spaces++){
                System.out.print(" ");
            }
            for(int cols=1;cols<=row;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1;row<=a;row++){
            for(int spaces=1;spaces<=row;spaces++){
                System.out.print(" ");
            }
            for(int cols=a;cols>row;cols--){
                System.out.print("* ");
            }
            System.out.println();
        }   
    }
}
