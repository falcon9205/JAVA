public class shortestpalindrome {
    static String shortestPalindrome(String s)
    {
      int i=0;
      int j = s.length()-1;
      while(j>=0)
      {
        if(s.charAt(i)==s.charAt(j))
          i++;
        j--;  
      }
      if(i==s.length())
        return s;
      String start = s.substring(i);
      String end = new StringBuilder(start).reverse().toString();
      String mid  = shortestPalindrome(s.substring(0,i));
      return end+mid+start;  
    }
    public static void main(String[] args) {
        String s = "aaba";
        System.out.println(shortestPalindrome(s));
    }
}
