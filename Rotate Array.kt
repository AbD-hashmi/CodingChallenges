/*Algorithim
1. Shift elements for k times. */
class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        var element = 0
        if(k == 0)
        return
        else{
             element = nums[nums.size-1]
            for(i in nums.size-2 downTo 0){
                nums[i+1] = nums[i]
            }
            nums[0]=element
            rotate(nums,k-1)
        }
    }
}