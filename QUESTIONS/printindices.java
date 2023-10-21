public class printindices {
    private static void searchelement(int a[] , int idx ,int x)
{
    if(idx == a.length)
      return;
    if(a[idx]==x) {
     System.out.print(idx+" ");
    }
    searchelement(a, idx+1, x);
}
    public static void main(String[] args) {
        int a[] = {9,3,4,7,7,8,9,0,7,0};
        int x = 7;
        searchelement(a, 0, x);
    }
}
