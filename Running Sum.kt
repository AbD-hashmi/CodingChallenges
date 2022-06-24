/* Algorith
1. Run a loop from Second index of the IntArray (1)
2. From that index update values going forward by adding each index item with previous item
*/
class Solution {
    fun runningSum(nums: IntArray): IntArray {
        for (i in 1 until nums.size){
             nums[i] = nums[i-1]+nums[i]
        }
        return nums
    }
}