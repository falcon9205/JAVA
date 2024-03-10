import java.util.*;

public class temp {
  public static int getCommon(int[] nums1, int[] nums2) {

    Set<Integer> list = new HashSet<Integer>();
    if (nums1.length >= nums2.length) {
      for (int i = 0; i < nums1.length; i++)
        list.add(nums1[i]);
      for (int i = 0; i < nums2.length; i++) {
        if (list.contains(nums2[i]))
          return nums2[i];
      }
      return -1;
    } else {
      for (int i = 0; i < nums2.length; i++)
        list.add(nums2[i]);
      for (int i = 0; i < nums1.length; i++) {
        if (list.contains(nums1[i]))
          return nums1[i];
      }
      return -1;
    }
  }

  public static void main(String[] args) {

  }
}