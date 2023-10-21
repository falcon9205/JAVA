import java.util.*;
public class longestsubstringlength{
 private static int check(String s)
 {
  Set<Character> list = new HashSet<Character>();
      int maxlength = 0;
      int  j = 0;
      for(int i = 0 ; i<s.length();i++)
      {
           if(!list.contains(s.charAt(i)))
            {  list.add(s.charAt(i));
              maxlength = Math.max(maxlength,i-j+1);
            }
            else{
              while(s.charAt(j)!=s.charAt(i))
                { list.remove(s.charAt(j));
                 j++;
                }
                list.remove(s.charAt(j));
                j++;
                list.add(s.charAt(i));
            }
      }
      return maxlength;
 }
  public static void main(String[] args) {
    String s = "pwwkew";
    System.out.println(check(s));
  }
}