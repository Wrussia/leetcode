package ru.wrussia.leetcode.medium

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

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

  def nonRecPow(x: Double, n: Int): Double = {
    val powOrder: ListBuffer[Int] = ListBuffer[Int]()
    var currN = n
    if (n == 0) return 1
    val addOne = if (n > 0) -1 else 1
    val base = if (n > 0) x else 1/x
    while (currN != 1 && currN != -1) {
      if (currN % 2 == 0) {
        powOrder.append(2)
        currN /= 2
      } else {
        powOrder.append(1)
        currN += addOne
      }
    }

    var res: Double = base
    for (i <- powOrder.reverse) i match {
      case 2 => res *= res
      case 1 => res *= base
    }
    res
  }
}
