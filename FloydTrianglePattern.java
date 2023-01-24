public class FloydTrianglePattern {

    public static void main(String args[]) {

        int n = 8;
int y = 1 ;
        for(int i=1;i<=8;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" "+y);
                y++;
            }
            System.out.println();
        }
        
    }
    
}
