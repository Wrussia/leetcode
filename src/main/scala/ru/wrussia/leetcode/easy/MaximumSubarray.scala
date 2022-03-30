package ru.wrussia.leetcode.easy

import scala.collection.mutable.ListBuffer

object MaximumSubarray {
  def maxSubArray(nums: Array[Int]): Int = {
    nums.tail.foldLeft((nums.head, nums.head)) { case ((globalMax: Int, currSum: Int), curr: Int) =>
      val cSum = curr + (if (currSum > 0) currSum else 0)
      val gMax = if (globalMax < cSum) cSum else globalMax
      (gMax, cSum)
    }._1
  }
}
