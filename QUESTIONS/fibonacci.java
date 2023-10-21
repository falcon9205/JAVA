public class fibonacci{
    private static int getfibo(int x)
    {  
        if( x==0)
          return 0;
        if( x==1)
          return 1; 
        int p = getfibo(x-1)+getfibo(x-2);  
        return p; 
     }
    public static void main(String[] args) {
         System.out.println(getfibo(1));
     }
}