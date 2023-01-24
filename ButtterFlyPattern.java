public class ButtterFlyPattern {
    public static void main(String args[]) {
int n=4, k=n+2,l=n-n;
        for(int i = 1;i<=n;i++ ){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int j =1;j<=k;j++){
                System.out.print(" ");
            }
            k= k-2;
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j = n;j>=i;j--){
                System.out.print("*");
            }
            for(int j =l;j>0;j--){
                System.out.print(" ");
            }
            l= l+2;
            for(int j = n;j>=i;j--){
                System.out.print("*");
            }
          
           
            System.out.println();

        }
        
    }
    
}
