class Solution {
    public int maxProfit(int[] prices) {
        int left =0;
        int right =1;
        int sell =0;
        while (right<prices.length) {
            if(prices[left]<prices[right]){
                int profit = prices[right] - prices[left];
                sell = Math.max(sell,profit);
            } else{
                left =right;
            }
            right++;
        }
        return sell;
    }
}