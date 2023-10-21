import java.util.*;
public class Hashmap{
    public static boolean bs(int a[],int x,int f,int l)
    {
        int mid = 0;
       do{
          mid = (f+l)/2;
         if(a[mid] ==x)
           return true;
         else if(a[mid]<x) 
           f = mid+1;
         else if(a[mid]>x)
           l = mid-1;  
       }while(f<=l);
       return false;
    }
    public static void main(String[] args) {
        int [][]matrix = {{1,3,5,7},{10,11,16,20},{23,30,24,60}};
        for(int i=0;i<matrix.length;i++)
        {
            if(bs(matrix[i],60,0,matrix[i].length-1))
            {
                System.out.println("true");
                break;
            }  
        }
    }
}