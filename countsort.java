import java.util.*;

public class countsort {
    public static void countingSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int max = arr[0];
        for (int num : arr) {
            max = Math.max(num, max);
        }
        int[] countArray = new int[max + 1];
        // for (int i = 0; i <= max; i++) {
        // countArray[i] = 0;
        // }
        // Count the occurrences of each element in the input array
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++)
            while (countArray[i] > 0) {
                arr[index++] = i;
                countArray[i]--;
            }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 8, 3, 3, 1 };
        System.out.println("Original array: " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
