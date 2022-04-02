package ru.wrussia.leetcode.medium

object RangeAddition {
  def arrayManipulation(n: Int, queries: Array[Array[Int]]): Long = {
    val arr = Array.fill[Long](n)(0)

    queries.foreach{ case Array(a,b,k) =>
      arr(a - 1) += k
      if (b < n) arr(b) -= k
    }

    var max = 0L
    var x = 0L
    for (i <- arr.indices) {
      x += arr(i)
      if (x > max) max = x
    }

    max
  }
}
