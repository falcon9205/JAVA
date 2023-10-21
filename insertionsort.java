public class insertionsort {
    private static void print(int a[])
    {
        for(int x: a)
         System.out.print(x+ " ");
        System.out.println(); 
    }
    private static void sort(int a[],int n)
    {
        for(int i=1;i<=n;i++)
         {
            int j=i-1;
            while(j>0 && a[j]<a[j-1])
            {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
         }
    }
    public static void main(String[] args) {
        int a[] = {4,3,6,2,1};
        print(a);
        sort(a,a.length);
        print(a);
    }
}
