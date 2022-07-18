/*Algorithm
1. While adding elements to the hashset check if the key is already added.
2. If yes the return true else false */
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
       var map = HashSet<Int>()
       for(i in 0 until nums.size){
           if(map.contains(nums[i])){
               return true
           }else{
               map.add(nums[i])
           }
       }
       return false
    }
}