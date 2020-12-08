package ArrayExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ArrayIntersection {
  public static int[] intersect(int[] nums1, int[] nums2) {
    if (nums1.length == 0 || nums2.length == 0) return new int[]{};
    ArrayList<Integer> sorted1 = new ArrayList<>();
    Arrays.stream(nums1).boxed().forEach(x -> sorted1.add(x));
    Collections.sort(sorted1);
    ArrayList<Integer> sorted2 = new ArrayList<>();
    Arrays.stream(nums2).boxed().forEach(x -> sorted2.add(x));
    Collections.sort(sorted2);
    HashMap<Integer, Integer> counts = new HashMap<>();

    int i = 0,j = 0;
    while (sorted1.get(i) > sorted2.get(j)) {
      j++;
    }
    while (sorted1.get(i) < sorted2.get(j)) {
      i++;
    }
    System.out.println(i);
    System.out.println(j);
    while (i < sorted1.size()) {
      Integer one = sorted1.get(i);
      int nj = j;
      while(nj < sorted2.size()) {
        Integer two = sorted2.get(nj);
        if (one == two) {
          if (counts.containsKey(one)) counts.put(one, counts.get(one) + 1);
          else counts.put(one, 1);
          break;
        }
        nj++;
      }
      i++;
    }
    int sum = 0;
    for (Integer val : counts.values()) {
      sum += val;
    }
    int[] intersection = new int[sum];
    int k = 0;
    for (Integer o : counts.keySet()) {
      for (int l = 0; l < counts.get(o); l++) {
        intersection[k] = o;
        k++;
      }
    }
    return intersection;
  }

  public static void main(String[] args) {
    int[] nums1 = {4,9,5};
    int[] nums2 = {9,4,9,8,4};
    System.out.println(Arrays.toString(intersect(nums1,nums2)));
  }
}
