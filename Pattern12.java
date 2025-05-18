public class Pattern12 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print("  ");
            }
            for(int col1=row;col1>=1;col1--){
                System.out.print(col1 + " ");
            }
            for(int col2=2;col2<=row;col2++){
                System.out.print(col2 + " ");
            }
            System.out.println(" ");
        }
    }
}
