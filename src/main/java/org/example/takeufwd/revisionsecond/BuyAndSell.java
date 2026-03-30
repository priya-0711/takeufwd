package org.example.takeufwd.revisionsecond;

public class BuyAndSell {
    public static void main(String[] args) {
        /*
        Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note: That buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
         */
        int [] prices = new int [] {7,6,4,3,1};
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<prices.length;i++) {
                min = Math.min(min, prices[i]);//1
                max = Math.max(max,prices[i]-min); //0
        }
        System.out.println(max);

    }
}
