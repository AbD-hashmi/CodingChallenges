/** Recursive arroach
 * Algorithm
 * 1. Check whichever value of the head nodes is smaller
 * 2. Call the same function with the node pointing to the next node with the smaller value
 * 3. Continue till either of the nodes is null
 */

class Solution {
  fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1

        if (list1.`val` < list2.`val`) {
            list1.next = mergeTwoLists(list1.next, list2)
            return list1
        }
        list2.next = mergeTwoLists(list2.next, list1)
        return list2
    }
}