public class powerfunc {
    private static int power(int p, int q)
    {   if(q==0)   // base case
        return 1;
      return power(p, q-1)*p;  //recursive and self work
    }
    public static void main(String[] args) {
        int p = 2;
        int q = 31;
        System.out.println(power(p,q));
        System.out.println(Math.pow(p, q));
        
    }
}
