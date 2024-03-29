import java.util.*;

public class knapsack {
    static int dp[][];

    public static void setter(int w, int n) {
        dp = new int[w + 1][n + 1];
        for (int i = 0; i < dp.length; i++)
            Arrays.fill(dp[i], -1);
    }

    public static void print() {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int knapsackfunc(int wt[], int profit[], int w, int n) {
        if (n == 0 || w == 0)
            return 0;

        if (dp[w][n] != -1)
            return dp[w][n];
        if (wt[n - 1] <= w)
            return dp[w][n] = Math.max(profit[n - 1] + knapsackfunc(wt, profit, w - wt[n - 1], n - 1),
                    knapsackfunc(wt, profit, w, n - 1));
        else
            return dp[w][n] = knapsackfunc(wt, profit, w, n - 1);
    }

    public static void main(String[] args) {
        int profit[] = { 1, 2, 3, 2 };
        int wt[] = { 4, 5, 1, 2 };
        int w = 5;
        int n = profit.length;

        setter(w, n);
        print();
        System.out.println(knapsackfunc(wt, profit, w, n));
        print();
    }
}