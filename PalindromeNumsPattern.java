public class PalindromeNumsPattern {
    public static void main(String args[]) {

        int n = 3; int r = 2;
        for(int i =1;i<=n;i++){
            for(int j=i;j<=n-1;j++){ 
                System.out.print(" ");
            }
            for(int k = i;k>0;k--){
                System.out.print(k);
            }
            for(int l = 2;l<=i;l++){
                System.out.print(l);
            }
System.out.println();
        }
        
    }
    
}
