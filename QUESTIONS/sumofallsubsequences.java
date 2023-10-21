public class sumofallsubsequences {
    private static void sumofall(int arr[],int n,int idx,int sum)
    {
        if(idx>=n)
         {
            System.out.print(sum+" ");
            return;
         }
        sumofall(arr, n, idx+1, sum+arr[idx]); //include
        sumofall(arr, n, idx+1, sum); //exclude
    }
    public static void main(String[] args) {
        int a[] = {2,4,5};
        sumofall(a,a.length,0,0);
    }
}
