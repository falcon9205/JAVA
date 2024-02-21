import java.util.HashMap;
import java.util.HashSet;

import javax.xml.stream.events.Characters;

public class example {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> list = new HashMap<>();
        HashSet<Character> list2 = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!list.containsKey(s.charAt(i))) {
                if (!list.containsValue(t.charAt(i))) {
                    list.put(s.charAt(i), t.charAt(i));
                } else {
                    return false;
                }
            } else {
                char ch = list.get(s.charAt(i));
                if (ch != t.charAt(i))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(isIsomorphic(s, t));
    }
}