import java.util.*;
public class slidingwindow{
  private static int window(int num[], int k)
  {
    int max = 0;
    int sum = 0;
    int j=0;
    int i=0;
    while(i<num.length)
    {
      while(j<num.length)
      {
        sum+=num[j];
        if(j-i+1<k)
          j++;
        else
        {
           max = Math.max(max,sum);  
           break;
        }   
      }
      sum-=num[i];
      if(j==num.length-1)
         break;
        j++;
        i++;  
    }
    return max;
  }
  public static void main(String[] args) {
    int a[] = {3,2,5,6,9};
    System.out.println(window(a,3));
  }
}