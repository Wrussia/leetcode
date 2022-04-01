package ru.wrussia.leetcode.medium

object MaximumSumCircularSubarray {

  def maxSubarraySumCircular(nums: Array[Int]): Int = {
    var currMax = nums(0)
    var currMin = nums(0)
    var globalMax = nums(0)
    var globalMin = nums(0)
    var wholeSum = nums(0)

    for (i <- 1 until nums.length) {
      wholeSum += nums(i)
      currMax = nums(i) + (if (currMax > 0) currMax else 0)
      currMin = nums(i) + (if (currMin > 0) 0 else currMin)
      if (globalMax < currMax) globalMax = currMax
      if (globalMin > currMin) globalMin = currMin
    }

    if (globalMax > 0 && wholeSum - globalMin > globalMax) wholeSum - globalMin else globalMax
  }
}
