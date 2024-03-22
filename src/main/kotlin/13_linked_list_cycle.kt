/**
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following
the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note
that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.



Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 */

class ListNode(value: Int) {
    var next: ListNode? = null
    fun hasCycle(head: ListNode?): Boolean {
        val nodes = mutableSetOf<ListNode>()
        return helperHasCycle(head, nodes)
    }
    fun helperHasCycle(node:ListNode?, setNodes:MutableSet<ListNode>):Boolean{
        if (node==null) return false
        if(setNodes.contains(node)) return true
        setNodes.add(node)
        return helperHasCycle(node.next, setNodes)
    }
}

fun main (){
    val head= ListNode(10)
    val node1=ListNode(20)
    val node2= ListNode(30)
    head.next=node1
    node1.next=node2
   // node2.next=head

    println(head.hasCycle(head))
}