/**
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
 */


class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        var res = nums[0]
        for (i in 1 until nums.size){
            res = res xor nums[i]
        }
        return res
    }
}