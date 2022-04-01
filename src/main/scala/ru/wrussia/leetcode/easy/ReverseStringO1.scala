package ru.wrussia.leetcode.easy

object ReverseStringO1 {
  def reverseString(s: Array[Char]): Unit = {
    val n = s.length/2
    for (i <- 0 until s.length / 2) {
      val tmpChar = s(i)
      s(i) = s(s.length - i - 1)
      s(s.length - i - 1) = tmpChar
    }
    println(s)
  }
}
