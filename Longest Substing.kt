/*Algorithim
 * 1. Create a result Subsring and add elements into it till you get a repeating character
 * 2. If char repeats then save the substring from the next index of the repeating character.
 * 3. Get the longest substring and get the max length 
 */
class Solution {
    fun lengthOfLongestSubstring(str: String): Int {
      var longestSubString = ""

      // Result
      var maxLength = -1

      // Return zero if string is empty
      if (str.isEmpty()) {
          return 0
      } else if (str.length == 1) {
          return 1
      }
      for (c in str.toCharArray()) {
          val current = c.toString()

          // If string already contains the character
          // Then substring after repeating character
          if (longestSubString.contains(current)) {
              longestSubString = longestSubString.substring(longestSubString.indexOf(current)+ 1)
          }
          longestSubString = longestSubString + c.toString()
          maxLength = Math.max(longestSubString.length, maxLength)
      }
      return maxLength
  }
}