package ArrayExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayIntersection {
  public static int[] intersect(int[] nums1, int[] nums2) {
    boolean smallerOne = nums1.length < nums2.length;
    int smallerArray = smallerOne? nums1.length : nums2.length;
    int[] smaller = smallerOne ? nums1 : nums2;
    int largerArray = smallerOne? nums2.length : nums1.length;
    int[] larger = smallerOne? nums2 : nums1;
    ArrayList<Integer> intersection = new ArrayList<>();

    for (int i = 0; i < largerArray;){
      boolean notAdded = true;
      for (int j = 0; j < smallerArray; j++){
        if (smaller[j] == larger[i] && notAdded) {
          intersection.add(smaller[j]);
          notAdded = false;
        }
        i++;
      }
      i++;
    }
    return intersection.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {
    int[] nums1 = {4,9,5};
    int[] nums2 = {9,4,9,8,4};
    System.out.println(Arrays.toString(intersect(nums1,nums2)));
  }
}
