public class reversestring {
    private static String reverse(String s)
    {
      if(s.length()==0) return ""; //also done by idx
      String ans = reverse(s.substring(1));
      return ans + s.charAt(0);
    }
    public static void main(String[] args) {
       String s = "panda";
       System.out.println(reverse(s));
    }
}