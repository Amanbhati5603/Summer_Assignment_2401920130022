class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                int currentProfit = prices[i] - min;
            

            if(currentProfit>maxProfit){
                maxProfit = currentProfit;
            }
            }
            
        }
        return maxProfit;
    }
}
