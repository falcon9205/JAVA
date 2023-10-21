import java.util.*;
public class zigzagconversion{
      private static String help(char a[][])
   { 
         String ans = "";
         for(int i=0;i<a.length;i++)
            for(int j=0;j<a[i].length;j++)
               if(a[i][j]!='\u0000')
                 ans+=a[i][j];
         return ans;
   }
     public static String convert(String s, int numRows)
     {
        if(s.length()<=2 || numRows==1)
          return s;
       char a[][]=new char[numRows][(s.length()/2)+2];
       int x = 0;
       int p = 0;
       int r=0;
       int q=0;
       int zigcount=0;
       int zig = numRows-2;
      inner: for(int i=0;i<a[0].length;i++)
       {
      loop:  for(int j=0;j<a.length;j++)
         {
             if(i==p)
              {
               a[j][i] = s.charAt(x++);
               r = i+1;
               q = j-1;
             
              }
              else
              {
               zigcount++;
               a[q--][r++]=s.charAt(x++);
               break loop;
              }
              if(x==s.length())
                break inner;
         }
         if(x==s.length())
                break inner;
         if(zigcount==zig)
          { 
             p+=zig+1;
             zigcount=0;
          }
       }
       return help(a);
     }
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int rows = 3; 
        System.out.print(convert(s,rows));
    }
   }