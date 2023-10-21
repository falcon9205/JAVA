public class sumofall {
    private static int sum(int a[],int idx)
    {
    // if(idx == a.length)
    //  return 0;
       if(idx == a.length-1)
          return a[idx];
       int sums = sum(a,idx+1);
       return sums + a[idx];   
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println(sum(a,0));
    }
}
