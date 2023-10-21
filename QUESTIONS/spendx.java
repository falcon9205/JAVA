import java.util.*;
public class spendx{
    private static int minOperations(int nums[], int x)
    {
        int st = 0;
        int end = 0;
        int maxsum = Arrays.stream(nums).sum();
        int sum = 0;
        int sumtomake = maxsum-x;
        int ans = 0;
        if(sumtomake ==0)
          return nums.length;
        while(end<nums.length)
          {
            sum += nums[end];
            while(st<nums.length && sum>sumtomake)
            {
                sum -= nums[st++];
            }
            if(sum == sumtomake)
            {
              ans = Math.max(ans,end - st+1);
            }
            end++;
          }
          
          return (ans==0)? -1 : nums.length-ans;
    }
    public static void main(String[] args) {
        int a[] = {8828,9581,49,9818,9974,9869,9991,10000,10000,10000,9999,9993,9904,8819,1231,6309};
        System.out.println(minOperations(a,134365));
    }
}