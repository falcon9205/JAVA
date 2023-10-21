public class lastindex {
    public static int lastIndex(int[] arr, int idx, int x) {
        if (idx == arr.length)
          return -1;
        
        int ans = lastIndex(arr, idx + 1, x);
        if (ans == -1) 
          if (arr[idx] == x)
            return idx;
          else 
            return -1;
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {5,1,5,6,7,0};
        System.out.println(lastIndex(a,0,5));
    }
}
