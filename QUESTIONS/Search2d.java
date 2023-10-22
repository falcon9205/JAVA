import java.util.*;
public class Search2d{
  public static boolean check(int a[][],int target,int i ,int j)
  {
     int mid = 0;
     while(i>=0 && j>=0 && j<a[0].length && i<a.length)
     {
      mid = a[i][j];
      if(mid == target)
        return true;
      else if(target < mid)
         j--;
      else if(target > mid)
        i++;     
     }
     return false;
  }
    public static void main(String[] args) {
        int mat[][] = {{1,1}};
        System.out.println(check(mat, 2, 0, mat[0].length-1));
    }
}