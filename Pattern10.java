public class Pattern10 {
    public static void main(String[] args) {
        int n = 4;
        int a=1;
        for(int rows=0;rows<=n;rows++){
            for(int cols=0;cols<=rows;cols++){
                System.out.print(a + " ");
                a ++;
            }
            System.out.println(" ");
        }   
    }
}
