/*Algorithm
 1. In a variable save the total sum of all the elements
 2. Run a loop and substract indexces one by one and check if the remaing sum is equal to the left sum if 
 then keep summing the index values and save them in a different variable*/
class Solution {
    fun pivotIndex(nums: IntArray): Int {
            var leftSum = 0
            var rightSum = 0
            var result = -1
        for (i in 0 until nums.size){
            rightSum = rightSum + nums[i]
        }
           for(i in 0 until nums.size){
               rightSum = rightSum - nums[i]
               if(leftSum == rightSum){
               result = i
                   break
               }
               leftSum = leftSum + nums[i]
           }
            
            return result
        }
    }