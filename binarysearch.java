public class binarysearch {
    private static void search(int a[],int f,int l,int x)
    {
       int mid=0;
       do{
         mid = f+(l-f)/2;
         if(a[mid]==x){
            mid++;
            System.out.println("Element found at "+mid);
            return;
         }
        else if(a[mid]<x)
           f = mid+1;
        else if(a[mid]>x)
           l = mid-1;     
       }while(f<=l);
       System.out.println("Element not found");
    }
    private static void print(int a[])
    {
        for(int x: a)
         System.out.print(x+" ");
        System.out.println(); 
    }
    public static void main(String[] args) {
        int a[] = {23,30,24,60};
        search(a,0,a.length-1,21);
    }
} 