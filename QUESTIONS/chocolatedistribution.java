import java.util.*;
public class chocolatedistribution{
  public static boolean check(int n[],int m,int max)
  {
    int nos = 1;
    int choc = 0;
    for(int i=0;i<n.length;i++)
    {
      if(n[i] > max) 
        return false;
      if(choc + n[i] <= max)
         choc+=n[i];
      else 
        {  nos++;
          choc = n[i];
        }
    }
    return nos<=m;
  }
  public static int distribute(int n[],int m)
  {
    int st = 1;
    int end = (int)1e9;
    int mid = 0;
    int ans = 0;
    while(st<=end)
    {
      mid = st + (end-st)/2;
      if(check(n,m,mid))
      {
        ans = mid;
        end = mid-1;
      }
      else{
        st = mid+1;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int n [] = {5,3,1,4,2};
    int m = 3;
    System.out.println(distribute(n,m));
  }
}