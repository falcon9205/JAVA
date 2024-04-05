import java.util.*;
import java.util.HashMap;
public class temp{
  public static int maxSubarrayLength(int[] nums, int k) {
        int count = Integer.MIN_VALUE;
        int tempmax = 0;
        HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
          if(freq.get(nums[i])==null || freq.get(nums[i])<k)
           {
            tempmax++;
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
           }
           else
            tempmax=0;
           
           count = Math.max(count,tempmax);

        }
        System.out.println(freq.entrySet());
        // HashMap<Integer,Integer> ans = new HashMap<Integer,Integer>();
        // for(int i=0;i<nums.length;i++)
        // {
        //   if(!freq.containsKey(nums[i]))
        //     freq.put(nums[i],1);
        //   else
        //     freq.put(nums[i],freq.get(nums[i])+1);  
        // }
        // System.out.println(freq.entrySet());
     
        // for(int i=0;i<nums.length;i++)
        // {
        //    if(freq.get(nums[i]) >= k && (ans.getOrDefault(nums[i], 1) <= k))
        //      {
        //       tempmax++;
        //       freq.put(nums[i],freq.get(nums[i])-1);
        //       if(!ans.containsKey(nums[i]))
        //         ans.put(nums[i],1);
        //       else
        //         ans.put(nums[i],ans.get(nums[i])+1); 
        //      }
        //      else{
        //       tempmax=0;
        //      }
        //       count = Math.max(tempmax,count);
        // }

        return count;
  }
  
  public static void main(String[] args) {
     int nums[] = {1};
     int k = 1;
     System.out.println(maxSubarrayLength(nums, k));
  }
}
