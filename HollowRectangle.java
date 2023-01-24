public class HollowRectangle{
    public static void Hollow(int row , int col) 
    {
          int f = row;                                 //******
          int t = col;                                 //*    *
        for( int i =1; i<= row;i++)                    //*    *
        {                                              //*    *
            for( int j =1; j<= col;j++)                //******
            {                                          
                 if(i==1||i==f ||j==1|| j==t )                    
                 {
                 System.out.print("*");
                 }
                 else
                 {
                 System.out.print(" ");
                 }
            }
            System.out.println("");
        }
    }
    public static void main(String args[]) 
    {  
      Hollow(5,4 );
    }
}