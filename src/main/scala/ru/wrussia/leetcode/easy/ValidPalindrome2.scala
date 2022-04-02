package ru.wrussia.leetcode.easy

object ValidPalindrome2 {
  def isValid(s: String, i: Int, j: Int): (Int, Int) = {
    var left = i
    var right = j
    while (left < right && s(left) == s(right)) {
      left += 1
      right -= 1
    }
    (left, right)
  }
  def validPalindrome(s: String): Boolean = {
    val (left, right) = isValid(s, 0, s.length - 1)
    if (left == right) true
    else {
      val leftPlus = isValid(s, left + 1, right)
      val rightPlus = isValid(s, left, right - 1)
      if (leftPlus._1 >= leftPlus._2) true
      else if (rightPlus._1 >= rightPlus._2) true
      else false
    }
  }
}
