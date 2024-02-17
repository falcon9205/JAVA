import java.lang.reflect.Array;
import java.util.*;

public class temp {
  public static int findLeastNumOfUniqueInts(int[] arr, int k) {
    TreeMap<Integer, Integer> list = new TreeMap<>();
    if (k > arr.length)
      return 0;
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      if (!list.containsKey(arr[i])) {
        list.put(arr[i], 1);
      } else
        list.put(arr[i], list.get(arr[i]) + 1);
    }
    ArrayList<Integer> l = new ArrayList<>(list.values());
    System.out.println(l);

    for (int i = 0; i < l.size(); i++) {
      if (l.get(i) >= 1) {
        int n = l.get(i);
        l.add(i, n--);
      } else if (l.get(i) == 0) {
        l.remove(i);
      }

    }
    System.out.println(l);
    return l.size();
  }

  public static void main(String[] args) {
    int n[] = { 2, 4, 1, 8, 3, 5, 1, 3 };
    System.out.println(findLeastNumOfUniqueInts(n, 1));
  }
}