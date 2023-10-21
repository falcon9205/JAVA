public class armstrong{
    private static int power(int num,int length,int sum)
    {   
      if(num == 0 )
        return sum;
      int digit = num%10;
      sum  +=  Math.pow(digit, length);  
      return power(num/10,length,sum);
    }
    public static void main(String[] args) {
        int x = 371;
        int length = 3;
        
        if(x == power(x, length, 0))
          System.out.println("true");
        else 
          System.out.println("False");
    }
}