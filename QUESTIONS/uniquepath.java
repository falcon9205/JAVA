import java.util.*;
public class uniquepath {
    private static int ways(int m , int n)
    {
        int N = m+n-2;
        int r = m-1;
        double res = 1;
        for(int i=1 ; i<=r ;i++)
           res = res*(N-r+i)/i;
        return (int)res;   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(ways(m, n));
    }
}
