public class mergesort{
    private static void print(int a[])
    {
        for(int x:a)
         System.out.print(x+" ");
        System.out.println(); 
    }
    private static void merge(int a[], int l, int mid, int r)
    {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0;i<n1;i++)
            left[i] = a[i+l];
        for(int i=0;i<n2;i++)
           right[i] = a[mid+1+i];
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2)
           {
               if(left[i]<right[j])
                  a[k++] = left[i++];
               else  
                  a[k++] = right[j++];
           }
        while(i<n1)
            a[k++] = left[i++];
        while(j<n2)
            a[k++] = right[j++];    
    }
    private static void sort(int a[] , int l, int r)
    {
        if(l >= r)
          return;
        int mid = l+(r-l)/2;
        sort(a,l,mid);
        sort(a,mid+1,r);
        merge(a,l,mid,r);
    }
    public static void main(String[] args) {
        int a[] = {4,1,0,3,6,2};
        print(a);
        sort(a,0,a.length-1);
        print(a);
    }
}