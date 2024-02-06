import java.util.*;

public class permutation {
    static List<List<Integer>> ans;

    private static List<List<Integer>> permute(int a[], int l, int r) {
        if (l == r) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int x : a)
                temp.add(x);
            ans.add(temp);
        }
        for (int i = l; i <= r; i++) {
            swap(a, l, i);
            permute(a, l + 1, r);
            swap(a, l, i);
        }
        return ans;
    }

    private static void swap(int a[], int i, int j) {
        int tmep = a[i];
        a[i] = a[j];
        a[j] = tmep;
    }

    public static void main(String[] args) {
        int a[] = { 2, 3, 1, 4 };
        ans = new ArrayList<>();

        System.out.println(permute(a, 0, a.length - 1));
    }
}
