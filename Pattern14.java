public class Pattern14 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=2*n;row++){
            int c=row>n?2*n-row:row;
            for(int k=1;k<=n-c;k++){
                System.out.print("  ");
            }
            for(int col1=c;col1>=1;col1--){
                System.out.print(col1 + " ");
            }
            for(int col2=2;col2<=c;col2++){
                System.out.print(col2 + " ");
            }
            System.out.println(" ");
        }   
    }
}
