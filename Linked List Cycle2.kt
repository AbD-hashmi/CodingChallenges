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
    fun detectCycle(head: ListNode?): ListNode? {
        if(head == null || head.next == null)return null
        var map = mutableSetOf<ListNode?>()
        var ptr = head
        while(ptr?.next != null){
        if(map.contains(ptr)) return ptr
          map.add(ptr) 
          ptr = ptr?.next
        }
        return null
}
}