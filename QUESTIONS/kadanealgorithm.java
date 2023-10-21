public class kadanealgorithm {
    private static int sumofarray(int a[])
    {
       int size = a.length;
       if(size == 1)
         return a[0];
       int max = Integer.MIN_VALUE;
       int sum = 0;
       for(int i=0;i<size;i++)
        {
            sum+=a[i];
            max = Math.max(max,sum);
            if(sum<0)
              sum = 0; 
        }  
        return max;
    }
    public static void main(String[] args) {
        int a[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(sumofarray(a));
    }
}
