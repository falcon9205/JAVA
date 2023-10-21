public class printsubs{
  private static void printsubsequences(String s,String curr)
  {
    if(s.length()==0){
      System.out.print(curr+",");
      return;
    }
    char ch = s.charAt(0);
    String remString = s.substring(1);
    printsubsequences(remString, curr+ch); 
    printsubsequences(remString, curr);
  }
  public static void main(String[] args) {
    String s = "abcabcbb";
    printsubsequences(s,"");
  }
}