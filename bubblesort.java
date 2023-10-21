public class bubblesort {
    private static void print(int a[])
    {
        for(int x: a)
           System.out.print(x+" ");
        System.out.println();   
    }
    private static void sort(int a[])
    {
        int n = a.length;
        for(int i=0;i<n;i++)
          for(int j=i;j<n-1-i;j++)
            if(a[j]>a[j+1])
            {
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
    }
    public static void main(String[] args) {
        int a[] = {4,66,3,2,1,0};
        print(a);
        sort(a);
        print(a);
    }
}
