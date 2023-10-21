import java.util.Scanner;
public class pascal{
   public static void main(String[] args) {
    int n = 5;
    int arr[][] = new int[n][n];
    arr[0][0] = 1;
    // arr[1][0] = 1;
    // arr[1][1] = 1;
     for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<=i;j++)
      {
         if(j==0 || j==i){
           System.out.print(arr[0][0]+" ");
           arr[i][j] = 1;
         }
         else{
           System.out.print(arr[i-1][j]+arr[i-1][j-1]+" ");
           arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
         }
      } 
      System.out.println();
    }
   }
}
