import java.util.*;
public class countsort {
    public static void countingSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        // Find the maximum element in the array
        int max = arr[0];
        for (int num : arr) {
            max = Math.max(num,max);
        }
        // Create a counting array and initialize it with zeros
        int[] countArray = new int[max + 1];
        for (int i = 0; i <= max; i++) {
            countArray[i] = 0;
        }
        // Count the occurrences of each element in the input array
        for (int num : arr) {
            countArray[num]++;
        }
        // Reconstruct the sorted array from the counting array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0) {
                arr[index++] = i;
                countArray[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original array: " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
