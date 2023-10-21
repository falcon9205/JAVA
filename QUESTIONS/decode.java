import java.util.*;
public class decode{
    public static String decodeAtIndex(String s, int k)
    {
       long size = 0;
       int n = s.length();
       for(char c : s.toCharArray())
       {
        if(Character.isDigit(c))
           size*=c-'0';
        else 
           size++;   
       }
       for(int i=n-1;i>=0;i--)
       {
         char ch = s.charAt(i);
         k%=size;
         if(k==0 && Character.isDigit(ch)==false)
            return ""+ch;
         if(Character.isDigit(ch))
            size/=(ch - '0');
         else  
           size--;     
       }
        return "";
    }
    public static void main(String[] args) {
        String s = "a23";
        int k = 6;
        System.out.println(decodeAtIndex(s,k));
    }
}