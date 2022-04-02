package ru.wrussia.leetcode.easy

import org.scalatest.{Matchers, WordSpecLike}

class TestMergeSortedArray extends WordSpecLike with Matchers {
  "case 1" in {
    val arr1 = Array(1, 2, 3, 0, 0, 0)
    val arr2 = Array(2, 5, 6)
    MergeSortedArray.merge(arr1, 3, arr2, 3)
  }
}
