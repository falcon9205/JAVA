import java.util.Scanner;
public class removeoccurrence {
    private static String remove(String s,int idx)
    {
       if(idx == -1)
         return ""; 
       String ans = remove(s,idx-1);
       if(s.charAt(idx)!='a')
         ans = ans + s.charAt(idx);
         return ans;
    }
  public static void main(String[] args) {
    String s = "ababcx";
    System.out.println(remove(s, s.length()-1));
  }  
}