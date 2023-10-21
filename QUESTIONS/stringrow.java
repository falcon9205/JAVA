import java.util.*;
public class stringrow {
    private static boolean line1(String s)
    {
        String temp = s.toLowerCase();
        String one = "qwertyuiop";
        for(int i=0;i<temp.length();i++)
        {
            String curr = temp.charAt(i)+"";
            if(!(one.contains(curr)))
               return false;
        }
        return true;
    }
    private static boolean line2(String s)
    {
        String temp = s.toLowerCase();
        String one = "asdfghjkl";
        for(int i=0;i<temp.length();i++)
        {
            String curr = temp.charAt(i)+"";
            if(!(one.contains(curr)))
               return false;
        }
        return true;
    }
    private static boolean line3(String s)
    {
        String temp = s.toLowerCase();
        String one = "zxcvbnm";
        for(int i=0;i<temp.length();i++)
        {
            String curr = temp.charAt(i)+"";
            if(!(one.contains(curr)))
               return false;
        }
        return true;
    }
    private static String[] findWords(String words[])
   {
       ArrayList<String> ans = new ArrayList<String>();
       for(int i=0;i<words.length;i++)
         {
            if(line1(words[i]))
              {
                ans.add(words[i]);
                continue;
              }
            if(line2(words[i]))
              {
                ans.add(words[i]);
                continue;
              }
             if(line3(words[i]))
              {
                ans.add(words[i]);
                continue;
              } 
         }
       String a[]= new String[ans.size()];
       for(int i=0;i<ans.size();i++)
         a[i] = ans.get(i);
       return a;  
   }
    public static void main(String[] args) {
        String s[] ={"hello","Alsaka","Dad"};
        String ans[] =findWords(s);
        for(String ss : ans)
          System.out.print(ss+" ");
        
    }
}
