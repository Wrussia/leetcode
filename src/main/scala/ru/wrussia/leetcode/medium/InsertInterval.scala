package ru.wrussia.leetcode.medium

import ru.wrussia.leetcode.shared.Intervals

import scala.collection.mutable.ArrayBuffer

object InsertInterval {

  def intersects(a: Array[Int], b: Array[Int]): Boolean = (a, b) match {
    case (Array(a1, b1), Array(a2, b2)) => Intervals.intersects(a1, b1, a2, b2)
    case _ => false
  }

  def insert(intervals: Array[Array[Int]], newInterval: Array[Int]): Array[Array[Int]] = {
    val result: ArrayBuffer[Array[Int]] = ArrayBuffer[Array[Int]]()
    var i = 0

    while (i < intervals.length && intervals(i)(1) < newInterval(0)) {
      result.append(intervals(i))
      i += 1
    }

    var tmpInterval = newInterval
    while (i < intervals.length && intersects(intervals(i), newInterval)) {
      tmpInterval = Array(math.min(tmpInterval(0), intervals(i)(0)), math.max(tmpInterval(1), intervals(i)(1)))
      i += 1
    }
    result.append(tmpInterval)

    while (i < intervals.length) {
      result.append(intervals(i))
      i += 1
    }

    result.toArray
  }
}
