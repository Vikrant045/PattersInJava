public class Zero0One1Triangle {
    public static void main(String args[]) {

        int n =5;

        for( int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
int sum = i+j;
                if(sum<11&& sum%2==0){
                    System.out.print(" 1");
                }
                else{
                    System.out.print(" 0");
                }
            }
            System.out.println();
        }
        
    }
    
}
