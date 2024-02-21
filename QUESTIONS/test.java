import java.util.*;
import java.util.Map;

public class test {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> list = new HashMap<>();
        HashMap<Character, Integer> list2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!list.containsKey(s.charAt(i)))
                list.put(s.charAt(i), 1);
            else {
                int freq = list.get(s.charAt(i));
                list.put(s.charAt(i), freq + 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (!list2.containsKey(t.charAt(i)))
                list2.put(t.charAt(i), 1);
            else {
                int freq = list2.get(t.charAt(i));
                list2.put(t.charAt(i), freq + 1);
            }
        }
        return list.equals(list2);
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}