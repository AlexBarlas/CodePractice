package ArrayExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SingleNumberFinder {
  public static int singleNumber(int[] nums) {
    HashMap<Integer, Integer> appearances = new HashMap<>();
    for (int i : nums) {
      appearances.computeIfAbsent(i, x->0);
      appearances.computeIfPresent(i, (x,y) -> appearances.get(i) + 1);
    }
    for (Map.Entry<Integer, Integer> entry :
            appearances.entrySet()) {
      if (entry.getValue() == 1) return entry.getKey();
    }
    return 0;
  }

  public static int singleNumberFast(int[] nums) {
    int res = 0;
    for (int i : nums) {
      res ^= i;
    }
    return res;
  }

  public static void main(String[] args) {
    int[] nums = {1,1,2,2,3,3,4};
    System.out.println(singleNumber(nums));
    System.out.println(singleNumberFast(nums));
  }
}
