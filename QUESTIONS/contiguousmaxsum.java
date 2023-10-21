public class contiguousmaxsum{
  private static int window(int nums[], int k)
  {
    int size = nums.length;
    if(size == 1)
      return nums[0];
    int max = 0;
    int sum = 0;
   for(int i=0;i<size; i++)
     {
      for(int j=i;j<size;j++)
      {
        sum+=nums[j];
         if(j!=size-1 && nums[j]>=nums[j+1])
         {
           i=j;
           break;
         }
      }
      max = Math.max(max,sum);
      sum = 0;
     }

    return max;
  }
  public static void main(String[] args) {
    int a[] = {3,6,10,1,8,9,9,8,9};
    System.out.println(window(a,3));
  }
}