package ru.wrussia.leetcode.medium

import scala.annotation.tailrec
import scala.collection.mutable

object PowXN {

  def recPow(x: Double, n: Int): (Double, Int) = {
    if (n == 1) (x, 1)
    else if (n % 2 == 0) {
      val tmp = recPow(x, n / 2)._1
      (tmp * tmp, -1)
    } else {
      val tmp = recPow(x, n - 1)._1
      (tmp * x, -1)
    }
  }

  def myPow(x: Double, n: Int): Double = {
    if (n == 0) 1d
    else if (n == 1) x
    else if (n == -1) 1/x
    else if (n < 0) (1/x) * recPow(1/x, -(n + 1))._1
    else x * recPow(x, n - 1)._1
  }
}
