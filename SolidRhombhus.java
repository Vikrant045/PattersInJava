public class SolidRhombhus{
    public static void SolidRhombhus(int n) {
//int n =n;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=n;k++){
System.err.print("*");
            }
            System.out.println();
        }
    }
        public static void SolidHollowRhombhus(int n) {
            //int n =n;
                    for(int i =1;i<=n;i++){
                        for(int j=1;j<=n-i;j++){
                            System.out.print(" ");
                        }
                        for(int k =1;k<=n;k++){
                            if(i==1||k==1||i==n||k==n){
                               System.out.print("*");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
        
    }
    public static void main(String args[]) {
        
        SolidRhombhus(14);
        SolidHollowRhombhus(14);
    }
}