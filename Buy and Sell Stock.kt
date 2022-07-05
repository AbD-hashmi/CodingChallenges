/*Algorith
The catch here is to find the max difference between the lowest and itrative value to find the max profit.
While itrating the array*/
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
             if(prices[i]-buyPrice > maxProfit)
             maxProfit = prices[i]-buyPrice
         }
        }
        return maxProfit
    }
}

/*
Runtime: 554 ms, faster than 99.45% of Kotlin online submissions for Best Time to Buy and Sell Stock.
Memory Usage: 57.1 MB, less than 94.87% of Kotlin online submissions for Best Time to Buy and Sell Stock.*/