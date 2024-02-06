import java.util.*;

public class temp {
  public static int firstUniqChar(String s) {
    if (s.length() == 1)
      return 0;
    char ch[] = s.toCharArray();

    int arr[] = new int[123];
    for (int i = 0; i < ch.length; i++) {
      arr[ch[i]]++;
    }

    for (int i = 0; i < ch.length; i++) {
      if (arr[ch[i]] == 1)
        return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    String s = "leetcode";
    System.out.println(firstUniqChar(s));
  }
}