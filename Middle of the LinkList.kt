/*Algorithm
 1. When traversing the list with a pointer slow, make another pointer fast that traverses twice as fast. 
 When fast reaches the end of the list, slow must be in the middle.*/
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
/*
Runtime: 159 ms, faster than 83.96% of Kotlin online submissions for Middle of the Linked List.
Memory Usage: 33.7 MB, less than 83.02% of Kotlin online submissions for Middle of the Linked List.
*/
class Solution {
    fun middleNode(head: ListNode?): ListNode? {
      var fast: ListNode? = head
        var slow = head
        while(fast?.next != null ){
            slow = slow?.next
            fast = fast?.next?.next
        }
        return slow
    }
}