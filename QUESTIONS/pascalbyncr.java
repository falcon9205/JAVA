public class pascalbyncr {
    private static int factorial(int n)
    {
        if(n==0)
          return 1;
        return factorial(n-1)*n;  
    }
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                  System.out.print("1 ");
                else  
                  System.out.print(factorial(i)/(factorial(j)*factorial(i-j))+" ");  
            } System.out.println();
        }
    }
}
