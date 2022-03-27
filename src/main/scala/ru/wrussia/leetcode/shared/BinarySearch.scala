package ru.wrussia.leetcode.shared

import scala.math.Ordering.Implicits.infixOrderingOps

object BinarySearch {
  def binarySearch[T : Ordering](sortedSeq: Seq[T], elem: T, start: Int = 0): Int = {
    var left = start
    var right = sortedSeq.length

    while (right - left > 1) {
      val i = (right - left) / 2 + left
      if (sortedSeq(i) > elem) right = i
      else left = i
    }
    if (left < sortedSeq.length && sortedSeq(left) > elem) -1 else left
  }
}
