public class LCM{
    private static int gcd(int x,int y)
    {
        if(y==0)
         return x;
        return gcd(y,x%y); 
    }

    
    private static int lcm(int x, int y)
    {
        return (x*y)/(gcd(x, y));
    }
    public static void main(String[] args) {
        System.out.println(lcm(3,6));
    }
}
