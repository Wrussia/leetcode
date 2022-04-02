package ru.wrussia.leetcode.easy

object MergeSortedArray {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Array[Int] = {
    var i = m - 1
    var j = n - 1
    var k = n + m - 1

    while (i >= 0 && j >= 0) {
      if (nums1(i) > nums2(j)) {
        nums1(k) = nums1(i)
        i -= 1
      } else {
        nums1(k) = nums2(j)
        j -= 1
      }
      k -= 1
    }

    while (i >= 0) {
      nums1(k) = nums1(i)
      k -= 1
      i -= 1
    }

    while (j >= 0) {
      nums1(k) = nums2(j)
      k -= 1
      j -= 1
    }

    nums1
  }
}
