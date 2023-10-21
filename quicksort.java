public class quicksort {
    private static void print(int a[])
    {
        for(int x: a)
         System.out.print(x+" ");
        System.out.println(); 
    } 
    private static void swap(int ar[], int a, int b)
    {
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }
    private static  int partition(int a[], int st, int end)
    {
        int pivot = a[st];
        int count=0;
        for(int i=st+1;i<=end;i++)
           if(pivot>=a[i])
              count++;
        int pivotindex = st+count;      
        swap(a,st,pivotindex); 
        int i = st;
        int j = end;
        while(i<pivotindex && j>pivotindex)
        {
            while(a[i]<=pivot)
              i++;
            while(a[j]>pivot)
              j--;
            if(i<pivotindex && j>pivotindex)
               swap(a,a[i],a[j]);
            i++;
            j--;        
        }
       return pivotindex;
    }
    private static void sort(int a[],int st, int end)
    {
        if(st >= end)
           return;
        int pi = partition(a,st,end);
        sort(a, st, pi-1);
        sort(a,pi+1,end);
    }
    public static void main(String[] args) {
        int a[] = {4,2,1,8,7};
        print(a);
        sort(a,0,a.length-1);
        print(a);
    }
}
