/*Algorithm
1. Run a loop on T and check if you find characters of S. When you do add a count
2. If count is equal to the siz of S return true else false */
class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var count = 0
        var result = false
        if(s.length == 0)
        if(count == s.length)
        return true
        
        for(i in 0..t.length - 1){
            if(t[i] == s[count]){
                count++
            }
            if(count == s.length){
        result = true
                break
            }
        }
        
        
        return result
    }
}
/*
Runtime: 137 ms, faster than 98.56% of Kotlin online submissions for Is Subsequence.
Memory Usage: 33.9 MB, less than 83.45% of Kotlin online submissions for Is Subsequence.
*/