import java.util.*;
public class palindrome {
    private static String palindrome(String s)
    {
        if(s.length()==0)
          return "";
        String ans = palindrome(s.substring(1));
         return ans + s.charAt(0);  

    }
    private static boolean palin(String s,int l,int r)
    {
      if(s.length()==0 || l>=r)
        return true;
      return (s.charAt(l) == s.charAt(r)) && palin(s, l+1, r-1); 
    }
    public static void main(String[] args) {
        String str = "naan";
        System.out.println(palindrome(str));
        if(str.equals(palindrome(str)))
              System.out.println("true palindrome");
        else
          System.out.println("False not palindrome");

        System.out.println(palin(str, 0,str.length()-1));    
    }
}
