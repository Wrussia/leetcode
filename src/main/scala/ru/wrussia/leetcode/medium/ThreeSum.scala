package ru.wrussia.leetcode.medium


import scala.collection.mutable
import scala.util.Sorting

object ThreeSum {

  def binarySearch(sortedSeq: Seq[Int], elem: Int, start: Int = 0): Int = {
    var left = start
    var right = sortedSeq.length

    while (right - left > 1) {
      val mid = (right - left) / 2 + left
      if (sortedSeq(mid) > elem) right = mid
      else left = mid
    }
    if (left < sortedSeq.length && sortedSeq(left) == elem) left else -1
  }

  def threeSum(nums: Array[Int]): List[List[Int]] = {
    Sorting.quickSort(nums)
    val resultSet = mutable.Set[List[Int]]()
    for (i <- nums.indices if nums(i) <= 0; j <- i + 1 until nums.length) {
      if (binarySearch(nums, -(nums(i) + nums(j)), j + 1) > 0)
        resultSet.add(List(nums(i), nums(j), -(nums(i) + nums(j))))
    }
    resultSet.toList
  }
}
