/*Algorith
1. We only have to find if the difference between two elements int the array is positive
2. Add them to get maximum profit at the end*/
class Solution {
    fun maxProfit(prices: IntArray): Int {
         if(prices.size < 2) return 0
        if(prices.size == 2){
            if(prices[0]<=prices[1]){
                return prices[1]-prices[0]
            }else
            return 0
        }
        var buyPrice = Integer.MAX_VALUE
        var maxProfit = 0
        for(i in 0 until prices.size){
         if(prices[i]< buyPrice){
             buyPrice = prices[i]
         }else{
             if(prices[i]-buyPrice>0 )
             maxProfit = (prices[i]-buyPrice) + maxProfit
             buyPrice = prices[i]
         }
        }
        return maxProfit
    }
}