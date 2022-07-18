/*Algorithm
1. Here i only increments if the elements are unique
2. While uniques elements found increment i and set the value as the next unique element*/
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if(nums.size == 0)
        return 0
        var i = 0
        for(j in 1 until nums.size){
            if(nums[i] != nums[j]){
                i++
                nums[i]= nums[j]
            }
        }
        
        return i+1
    }
}