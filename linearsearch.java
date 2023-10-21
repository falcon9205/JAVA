public class linearsearch {
  private static int search(int a[],int idx, int x)
    {
        if(a[idx]==x)
          return idx;  
        if(idx == a.length-1)
           return -1;
        return search(a, idx+1, x);   
         
    }
    public static void main(String[] args) {
        int a[] = {5,9,1,3,99};
        if(search(a,0,0)>0)
          System.out.println("Found at "+search(a, 0, 0));
        else 
         System.out.println("Not found");  
    }
}
