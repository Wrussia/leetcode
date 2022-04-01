package ru.wrussia.leetcode.medium


import scala.collection.mutable
import scala.util.Sorting

object ThreeSum {

  def threeSum(nums: Array[Int]): List[List[Int]] = {
    Sorting.quickSort(nums)
    val result = mutable.Set[List[Int]]()

    for (i <- 0 until nums.length - 2
         if nums(i) <= 0 &&
           (nums(i) == 0 || i == 0 || nums(i) != nums(i - 1))) {
      var left = i + 1
      var right = nums.length - 1
      while (left < right) {
        val currSum = nums(i) + nums(left) + nums(right)
        currSum match {
          case 0 =>
            result += List(nums(i), nums(left), nums(right))
            left += 1
            right -= 1
          case _ if currSum < 0 => left += 1
          case _ if currSum > 0 => right -= 1
        }
      }
    }

    result.toList
  }
}
