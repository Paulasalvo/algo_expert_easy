//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the
// non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.

class Solution2 {
    fun moveZeroes(nums: IntArray): Unit {
        var count= 0

        for (i in nums.indices) {
            if (nums[i] != 0){
                nums[count] = nums[i]
                count+=1
            }
        }

        while (count<nums.size){
            nums[count]=0
            count+=1
        }

    }
}



fun main(){


}
