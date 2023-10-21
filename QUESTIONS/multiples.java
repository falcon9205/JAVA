public class multiples{
    private static void multiples(int num,int k)
    {
        if(k==1)
          {
             System.out.print(num+" ");
             return;
          }
        multiples(num, k-1);
        System.out.print(num*k+" ");
    }
    public static void main(String[] args) {
        int num = 12;
        int k = 5 ;
        multiples(num,k);
    }
}