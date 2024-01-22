/**
Two number sum
Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
If any two numbers in the input array sum up to the target sum, the function should return them in an array, in any
order. If no two numbers sum up to the target sum, the function should return an empty array.

Note that the target sum has to be obtained by summing two different integers in the array; you can't add a single
integer to itself in order to obtain the target sum.

You can assume that there will be at most one pair of numbers summing up to the target sum.

Sample Input
array = [3, 5, -4, 8, 11, 1, -1, 6]
targetSum = 10
Sample Output
[-1, 11]
 */

fun twoNumberSum1(array: MutableList<Int>, targetSum: Int): List<Int> {
    for (i in 0 until array.size){
       for (j in i+1 until array.size){
           if (array[i]+array[j]== targetSum){
               return listOf(array[i], array[j])
           }
       }
    }
    return listOf<Int>()
}

fun twoNumberSum2(array: MutableList<Int>, targetSum: Int): List<Int> {
    array.sort()
    var left= 0
    var right = array.size-1

    while (left<right){
        var sum = array[left]+array[right]
        if (sum ==targetSum){
            return listOf(array[left],array[right])
        }else if(sum<targetSum){
            left++
        }else if(sum>targetSum){
            right--
        }
    }

    return listOf<Int>()
}
