package ArrayExercises;

import java.util.Arrays;
import java.util.Collections;

public class PlusOne {
  public static int[] plusOne(int[] digits) {
    int index = digits.length;
    for(int i = index-1; i >= 0; i--){
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
    }
    int[] newArray = new int[index+1];
    newArray[0] = 1;
    return newArray;
  }

  public static void main(String[] args) {
    int[] digits = {1,2,3,4};
    int[] digits2 = {9};
    int[] digits3 = {9,9,9,9};
    System.out.println(Arrays.toString(plusOne(digits)));
    System.out.println(Arrays.toString(plusOne(digits2)));
    System.out.println(Arrays.toString(plusOne(digits3)));
  }
}
