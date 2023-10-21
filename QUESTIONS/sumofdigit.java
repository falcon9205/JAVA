public class sumofdigit {
    private static int sum(int x)
    {
        if(x>=0 && x<=9)
           return x; 
           
       return  sum(x/10)+x%10;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sum(n));
    }
}
