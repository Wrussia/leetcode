package ru.wrussia.leetcode.medium

import scala.collection.mutable

object KDiff {
  def findPairs(nums: Array[Int], k: Int): Int = {
    var result = 0
    val resultSet: mutable.Set[Int] = scala.collection.mutable.Set[Int]()

    if (k != 0) {
      val numsSet = nums.toSet
      for (num <- nums if numsSet.contains(num + k) && !resultSet.contains(num)) {
        result += 1
        resultSet += num
      }
    } else {
      result = nums.groupBy(k => k).map { case (_, v) => v.length }.count(_ > 1)
    }
    result
  }
}
