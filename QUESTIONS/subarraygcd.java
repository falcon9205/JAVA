public class subarraygcd {
    private static int gcd(int x, int y)
    {
        while(x%y!=0)
        {
         int rem = x%y;
         x=y;
         y=rem;
        }
        return y;
    }
    private static int check(int nums[],int k)
    {
        int cnt = 0;
        for(int i=0;i<nums.length;i++)
        {
            int temp = nums[i];
            if(temp==k)
              cnt++;
            for(int j=i+1;j<nums.length;j++)
             { if(nums[j]==k){
                temp = gcd(nums[j], temp);
                if(temp == k)
                   cnt++;
              }
              else 
                break;
            }     
        }
        return cnt;
    }
    public static void main(String[] args) {
        int x [] = {9,3,1,3,6};
        System.out.println(check(x, 3));
    }
}
