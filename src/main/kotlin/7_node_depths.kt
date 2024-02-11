import java.util.*

/**
The distance between a node in a Binary Tree and the tree's root is called the node's depth. Write a function
that takes in a Binary Tree and returns the sum of its nodes' depths.
Each BinaryTree node has an integer value, a left child node, and a right  child node. Children nodes can
either be BinaryTree nodes themselves or None /null.
Sample Input
tree =    1
       /     \
      2       3
    /   \   /   \
   4     5 6     7
 /   \
8     9
Sample Output
16
// The depth of the node with value 2 is 1.
// The depth of the node with value 3 is 1.
// The depth of the node with value 4 is 2.
// The depth of the node with value 5 is 2.
// Etc..
// Summing all of these depths yields 16.
 */




open class BinaryTree(value: Int) {
    var value = value
    var left: BinaryTree? = null
    var right: BinaryTree? = null
}
open class level(root:BinaryTree?, depth:Int){
    val root= root
    val depth= depth
}
fun nodeDepths(root: BinaryTree?, depth:Int = 0): Int {
    if (root == null) return 0
    return depth + nodeDepths(root.left, depth+1)+ nodeDepths(root.right, depth+1)
}

fun nodeDepths2 (root:BinaryTree):Int{
    var sumOfDepths= 0
    val stack = Stack<level>()
    stack.add(level(root,0))
    while (stack.size>0){
        val top= stack.pop()
        val node = top.root
        val depth = top.depth
        if (node== null) continue
        sumOfDepths+=depth
        stack.add(level(node.left, depth+1))
        stack.add(level(node.right, depth+1))
    }
    return sumOfDepths
}

fun main(){
    val root= BinaryTree(1)
    root.left=BinaryTree(2)
    root.right=BinaryTree(3)

    println(nodeDepths2(root))
}



