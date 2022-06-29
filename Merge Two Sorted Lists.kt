/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

/**
 * Algothim 
 * 1. Create two new nodes for current node and head node
 * 2. Check the smaller of the two head nodes of the list and save its value in current and head nodes for future use
 * 3. Run a loop and check for the smaller value of the two, switch to the next node of the list whichever is smaller
 * 4. Repeat step 3 until one the lists next pointer is null
 * 5. Add the last value to the list and retun the final output
 */ 

/*
 Runtime: 176 ms, faster than 96.59% of Kotlin online submissions for Merge Two Sorted Lists.
Memory Usage: 35 MB, less than 95.56% of Kotlin online submissions for Merge Two Sorted Lists.
*/

class Solution {
    var count = 0
  fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
      
      if(list1 == null) return list2
      if(list2 == null) return list1
      
      var head :ListNode?= null
      var current :ListNode?= null 
      var ptr :ListNode?= list1
      var ptrr :ListNode?= list2
      if(list1.`val`!! <= list2.`val`!!){
            current = list1
            head = current
            ptr = list1?.next
      }else{
            current = list2
          head = current
            ptrr = list2?.next
      }
      while(ptr != null && ptrr != null){
          if(ptr.`val`!! < ptrr.`val`!!){
              current?.next = ptr
              current = current?.next
              ptr = ptr?.next
          }else{
              current?.next = ptrr
              current = current?.next
              ptrr = ptrr?.next
          }
      }
      if(ptr == null){
          current?.next = ptrr
      }else{
          current?.next = ptr
      }
    return head
    }
}