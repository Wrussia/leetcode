package ru.wrussia.leetcode.shared

object Intervals {
  def intersects(a1: Int, b1: Int, a2: Int, b2: Int): Boolean = {
    a2 <= b1 && a1 <= b2
  }
}
