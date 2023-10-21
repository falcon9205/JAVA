public class greatest{
  private static int max(int a[],int idx)
  {
    if(idx == a.length-1)
       return a[idx];  
    return Math.max(a[idx+1], max(a, idx+1));
  }
    public static void main(String[] args) {
        int a[] = {4,5,99};
   System.out.println(max(a, 0));       }
}