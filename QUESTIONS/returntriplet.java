import java.util.*;
public class returntriplet {
    private static List<List<Integer>> threeSum(int nums[])
    {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        boolean flag = false;
     loop:   for(int i : nums)
          {
             if(i==0)
              flag = true;
             else{
               flag = false; 
               break loop;
             }
          }
        if(flag)  
        {
            List<Integer> addup = new ArrayList<Integer>();
                addup.add(0);
                addup.add(0);
                addup.add(0);
                ans.add(addup);
                return ans;
        }
        int j=0;
        Arrays.sort(nums);
        int k=nums.length-1;
        for(int i=0;i<nums.length-2;i++)
        {
           j=i+1;
           while(k!=j)
           {
            if(nums[i]+nums[j]+nums[k]==0 && (i!=j && i!=k && j!=k))
              {
                List<Integer> addup = new ArrayList<Integer>();
                addup.add(nums[i]);
                addup.add(nums[j]);
                addup.add(nums[k]);
                ans.add(addup);
              }
              k--;
           }

           k=nums.length-1;
        }
       
        return ans;

    }
    public static void main(String[] args) {
        int nums[] = {-1,1,0};
        System.out.println(threeSum(nums));
    }
}
