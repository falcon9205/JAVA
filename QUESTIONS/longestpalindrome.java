public class longestpalindrome{
    private static boolean palindrome(String c)
    {
        boolean statement = true;
        for(int i=0;i<c.length()/2;i++)
         {
            if(c.charAt(i)!=c.charAt(c.length()-1-i))
                statement = false;
         }
         return statement;
    }
    public static String longest(String s)
    {
        if(s.length()==0 || s.length()==1)
           return s.substring(0);
        String ans = "";
        StringBuffer temp = new StringBuffer(s);
       for(int i=0;i<s.length();i++)
          for(int j=i;j<s.length();j++)
            {
                if(palindrome(temp.substring(i, j+1)) && ans.length()<temp.substring(i, j+1).length()){
                  ans= temp.substring(i,j+1); 
                   
                }
            }
        return ans;
    }
    public static void main(String[] args) {
        String s = "lejyqjcpluiggwlmnumqpxljlcwdsirzwlygexejhvojztcztectzrepsvwssiixfmpbzshpilmojehqyqpzdylxptsbvkgatzdlzphohntysrbrcdgeaiypmaaqilthipjbckkfbxtkreohabrjpmelxidlwdajmkndsdbbaypcemrwlhwbwaljacijjmsaqembgtdcskejplifnuztlmvasbqcyzmvczpkimpbbwxdtviptzaenkbddaauyvqppagvqfpednnckooxzcpuudckakutqyknuqrxjgfdtsxsoztjkqvfvelrklforpjnrbvyyvxigjhkjmxcphjzzilvbjbvwiwnnkbmboiqamgoimujtswdqesighoxsprhnsceshotakvmoxqkqjvbpqucvafiuqwmrlfjpjijbctfupywkbawquchbclgvhxbanybret";
        System.out.println(longest(s));
    }
}