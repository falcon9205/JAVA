public class selectionsort {
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
        {
            for(int j=i+1;j<n;j++)
              if(a[i]>a[j])
                 {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                 }
        }
     }
    public static void main(String[] args) {
        int a[] = {5,22,8,0,1,66};
        print(a);
        sort(a);
        print(a);
    }
}
