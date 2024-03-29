/**

Write a function that takes in a Binary Search Tree (BST) and a target integer value and returns the closest
value to that target value contained in the BST.You can assume that there will only be one closest value.
Each BST  node has an integer value, a left  child node, and a right  child node. A node is said to be a valid BST
node if and only if it satisfies the BST property: its value is strictly greater than the values of every node to its left;
its value is less than or equal to the values of every node to its right; and its children nodes are either valid BST
nodes themselves or None /null.
Sample Input
 tree  =   10
         /     \
        5      15
      /   \   /   \
     2     5 13   22
   /           \
  1            14
target=12
Sample Output= 13
 */


import kotlin.math.abs

open class BST(value: Int) {
    var value = value
    var left: BST? = null
    var right: BST? = null
}


fun findClosestValueInBst(tree: BST, target: Int): Int {
    var currentValue = tree.value

    currentValue = findClosestValueInBstHelper(tree, target, currentValue)

    return currentValue
}

fun findClosestValueInBstHelper(tree: BST?, target: Int, closestValue: Int): Int{
    if (closestValue == target || tree == null) {
        return closestValue
    }
    var closest = closestValue
    val currentDiff = abs(closestValue - target)
    val candidateDiff = abs(tree.value - target)

    if (candidateDiff < currentDiff){
        closest = tree.value
    }

    if(tree.value < target){
        return findClosestValueInBstHelper(tree.right, target, closest)
    }else {
        return findClosestValueInBstHelper(tree.left, target, closest)
    }
}

fun main() {
    val root= BST(1)
    root.left=BST(2)
    root.right=BST(3)

    println(findClosestValueInBst(root, 12))
}