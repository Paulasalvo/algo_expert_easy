import kotlin.time.times

/**
Write a function that takes in a non-empty array of integers that are sorted in ascending order and returns a new
array of the same length with the squares of the original integers also sorted in ascending order.
Sample Input
array = [1, 2, 3, 5, 6, 8, 9]
Sample Output
[1, 4, 9, 25, 36, 64, 81]
 */

fun sortedSquaredArray(array: List<Int>): List<Int> {
    var left= 0
    var right=array.size-1
    val doubleArray = MutableList(array.size) { 0 }
    for (i in doubleArray.size - 1 downTo 0)
        if (array[left]*array[left]>array[right]*array[right]){
            doubleArray[i]=array[left]*array[left]
            left+=1
        }else{
            doubleArray[i]=array[right]*array[right]
            right-=1
        }
    return doubleArray
   }



