package ArrayExercises;

public class BestProfit {
  public static int maxProfit(int[] prices) {
    int max = 0;
    for (int i = 0; i < prices.length - 1; i++){
      if (prices[i+1] > prices[i]) max = max + prices[i+1] - prices[i];
    }
    return max;
  }

  public static void main(String[] args) {
    int[] prices = {7,1,3,4,5,2,6};
    System.out.println(maxProfit(prices));
  }
}
