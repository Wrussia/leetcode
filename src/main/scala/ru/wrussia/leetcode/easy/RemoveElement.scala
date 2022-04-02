package ru.wrussia.leetcode.easy

object RemoveElement {
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    var shift = 0
    var i = 0
    while (i < nums.length) {
      if (nums(i) == `val`) shift += 1
      else nums(i - shift) = nums(i)
      i+=1
    }
    nums.length - shift
  }
}
