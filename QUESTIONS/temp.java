import java.util.*;
import java.util.ArrayList;

public class temp {
  public static int[][] flipAndInvertImage(int[][] image) {
    for (int i = 0; i < image.length; i++) {
      for (int j = 0; j < image[i].length / 2; j++) {
        int temp = image[i][j];
        image[i][j] = image[i][image[i].length - 1 - j];
        image[i][image[i].length - 1 - j] = temp;
      }
      
    }
    return image;
  }

  public static void main(String[] args) {
    int image[][] = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
    System.out.println(flipAndInvertImage(image));
  }
}