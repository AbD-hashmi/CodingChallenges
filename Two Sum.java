/**Algorithm
1. While traversing the array add it to a hashmap and keep checking if the targer - element
 already exists in the map
 */
 class Solution {
	int[] twoSum(int[] A, int target) {
	    // add your logic here
		HashMap<Integer,Integer> map = new HashMap<>();
			int[] result = new int[3];
			for (int i = 0;i<A.length;i++){
				int key = target - A[i];
				if(map.containsKey(key)){
					result[0] = i;
						result[1] = map.get(key);
				}
				map.put(A[i],i);
			}
		return result;
	}
}