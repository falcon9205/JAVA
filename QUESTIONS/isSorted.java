public class isSorted {
    private static boolean sorted(int a[],int idx)
    {
        if(idx==1 || idx ==0)
          return true;
        if(a[idx-1]<a[idx-2])
          return false;
        return sorted(a, idx-1);    
    }
    public static void main(String[] args) {
        int a[] = {2,5,9};
        if(sorted(a,a.length))
          System.out.println("Yes");
        else 
          System.out.println("No");  
    }
}
