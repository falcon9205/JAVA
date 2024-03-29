import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class example {
    public static int fib(int n, int dp[]) {
        if (n <= 1) {
            dp11[n] = n;
            return n;
        }
        if (dp[n] != -1)
            return dp[n];
        dp[n] = fib(n - 1, dp) + (fib(n - 2, dp));
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fib(n, dp));
        for (int num : dp)
            System.out.print(num + " ");
    }
}