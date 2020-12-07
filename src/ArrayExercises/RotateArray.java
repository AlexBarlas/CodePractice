package ArrayExercises;

import java.util.Arrays;

public class RotateArray {
  public static void rotate(int[] nums, int k) {
    int[] copy = nums.clone();
    for (int i = 0; i < nums.length; i++){
      int shift = (i+k) % nums.length;
      nums[shift] = copy[i];
    }
  }

  public static void main(String[] args) {
    int[] array = {1,2,3,4,5,6,7};
    rotate(array, 3);
    System.out.println(Arrays.toString(array));
  }
}
