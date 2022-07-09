/*Algorithim
 * 1. Create a result Subsring and add elements into it till you get a repeating character
 * 2. If char repeats then save the substring from the next index of the repeating character.
 * 3. Get the longest substring and get the max length 
 */
class Solution {
	int longestSubstringWithoutRepeat(String s) {
	    // add your logic here
		String resultString = "";
		int result = 0;
		char[] charArr = s.toCharArray();
		for(int i =0;i<charArr.length;i++){
			if(resultString.contains(charArr[i]+""))
				resultString = resultString.substring(resultString.indexOf(charArr[i])+1);
			resultString += charArr[i];
			result = Math.max(resultString.length(),result);
		}
		return result;
	}
}