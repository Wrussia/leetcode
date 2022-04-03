package ru.wrussia.leetcode.medium


object NextPermutation {
  def binarySearch(nums: Array[Int], elem: Int, start: Int = 0): Int = {
    var left = start
    var right = nums.length - 1
    while (left + 1 < right) {
      val mid = left + (right - left) / 2
      if (nums(mid) >= elem) left = mid
      else right = mid
    }
    if (nums(right) >= elem) right else left
  }

  def swap(nums: Array[Int], left: Int, right: Int): Unit = {
    val tmp = nums(left)
    nums(left) = nums(right)
    nums(right) = tmp
  }

  def nextPermutation(nums: Array[Int]): Array[Int] = {
    if (nums.length <= 1) return nums
    val N = nums.length - 1
    var i = N

    while (i > 0 && nums(i) <= nums(i - 1)) i -= 1
    val left = i

    if (left > 0) {
      val placeTo = binarySearch(nums, nums(left - 1) + 1, left)
      swap(nums, left - 1, placeTo)
    }

    i = 0
    val mid = left + (N - left) / 2
    while (left + i <= mid) {
      swap(nums, left + i, N - i)
      i += 1
    }
    nums
  }
}
