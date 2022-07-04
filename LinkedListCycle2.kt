/*Algorithm
1. Add nodes to a set till you get the same node or null */
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    var map = mutableSetOf<ListNode?>()
fun detectCycle(head: ListNode?): ListNode? {
if(head == null || head.next == null)return null
if(map.contains(head))return head
  map.add(head) 
return detectCycle(head?.next)      
}
}