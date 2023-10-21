import java.util.ArrayList;
import java.util.Arrays;
public class subsequent{
    private static ArrayList<String> subsequences(String s)
    {
        ArrayList<String> list = new ArrayList<String>();
        if(s.length()==0){
          list.add("");
          return list;
        }
        char curr = s.charAt(0);
        ArrayList<String> smallans = subsequences(s.substring(1));
        for(String ss : smallans ){
             list.add(curr+ss);
          list.add(ss);
        }
        return list;
    }
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> ans = subsequences(s);
        System.out.println(ans); 
    }
}