import java.util.*;
public class jumpcost{
    private static int jump(int nums[],int n,int idx)
    {  
        if(idx == n-1) 
           return 0;
        int opt1 = Math.abs(nums[idx]-nums[idx+1])+jump(nums,n,idx+1);
        if(idx == n-2) 
          return opt1;
        int opt2 = Math.abs(nums[idx]-nums[idx+2])+jump(nums,n,idx+2);
        return Math.min(opt1, opt2);
   
    }
    public static void main(String[] args) {
      int a[]={10,30,40,20};
      System.out.println(jump(a,a.length,0));
    }
}