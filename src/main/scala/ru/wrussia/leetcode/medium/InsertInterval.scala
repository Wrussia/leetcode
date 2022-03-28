package ru.wrussia.leetcode.medium

import ru.wrussia.leetcode.shared.Intervals

import scala.collection.mutable.ArrayBuffer

object InsertInterval {

  def intersects(a: Array[Int], b: Array[Int]): Boolean = (a,b) match {
    case (Array(a1,b1),Array(a2,b2)) => Intervals.intersects(a1,b1,a2,b2)
    case _ => false
  }

  def insert(intervals: Array[Array[Int]], newInterval: Array[Int]): Array[Array[Int]] = {
    val result: ArrayBuffer[Array[Int]] = ArrayBuffer[Array[Int]]()
    var tmpInterval: Array[Int] = null
    var flag = "before"

    if (intervals.isEmpty) return Array(newInterval)

    if (intervals.nonEmpty && newInterval(1) < intervals.head(0)) result.append(newInterval)

    for (interval <- intervals) {
      if (intersects(interval, newInterval)) {
        if (tmpInterval == null) tmpInterval = Array(math.min(interval(0), newInterval(0)), math.max(interval(1), newInterval(1)))
        else tmpInterval = Array(tmpInterval(0), math.max(interval(1), tmpInterval(1)))
        flag = "in_progress"
      } else if (flag == "in_progress")  {
        result.append(tmpInterval)
        flag = "finished"
      }
      if (flag == "before" || flag == "finished") {
        result.append(interval)
      }
    }

    if (intervals.nonEmpty && intervals.last(1) < newInterval(0)) result.append(newInterval)

    result.toArray
  }
}
