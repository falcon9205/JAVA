import java.lang.reflect.Array;
import java.util.*;
public class threesumclosest{
  private static int threeSumClosest(int[] nums, int target)
  {
    Arrays.sort(nums);
    int left = 0;
    int diff = Integer.MAX_VALUE;
    int ans = Integer.MIN_VALUE;
    int right = nums.length-1;
    for(int i=0;i<=nums.length-2;i++)
    {
        left = i+1;
        right = nums.length-1;
        while(left<right)
        {   if(nums[i]+nums[left]+nums[right]==target)
               return target;
           else if(Math.abs(nums[i]+nums[left]+nums[right]-target)<diff)
           {
              diff = Math.abs(nums[i]+nums[left]+nums[right]-target);
              ans = nums[i]+nums[left]+nums[right];
           }
        if(nums[i]+nums[left]+nums[right]>target)
           right--;
        else
          left++;   
        }
    }
    return ans;
  }
  public static void main(String[] args) {
    int a[] = {0,3,97,102,200};
    System.out.println(threeSumClosest(a,300));
  }
}