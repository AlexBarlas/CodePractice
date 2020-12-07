package ArrayExercises;

import java.util.HashSet;

public class FindDuplicates {
  public static boolean containsDuplicate(int[] nums) {
    HashSet<Integer> seen = new HashSet<>();
    for (int i : nums) {
      if (seen.contains(i)) return true;
      else seen.add(i);
    }
    return false;
  }

  public static void main(String[] args) {
    int[] dups = {1,2};
    System.out.println(containsDuplicate(dups));
  }
}
