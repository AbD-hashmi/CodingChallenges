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
  * Runtime: 151 ms, faster than 99.72% of Kotlin online submissions for Reverse Linked List.
Memory Usage: 35.9 MB, less than 83.26% of Kotlin online submissions for Reverse Linked List.
  */
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var current = head
        var prev: ListNode? = null
        while(current!= null){
            var temp = current?.next
            current?.next = prev
            prev = current
            current = temp
        }
        return prev 
    }
}