package ru.wrussia.leetcode.medium

import org.scalatest.{Matchers, WordSpecLike}

class TestInsertIntervals extends WordSpecLike with Matchers {


  "case 1" in {
    val intervals = Array(Array(1, 2), Array(3, 5), Array(6, 7), Array(8, 10), Array(12, 16))
    val newInterval = Array(4, 8)
    val expected = Array(Array(1, 2), Array(3, 10), Array(12, 16))

    InsertInterval.insert(intervals, newInterval) shouldBe expected
  }

  "case 2" in {
    val intervals = Array(Array(1, 3), Array(6, 9))
    val newInterval = Array(2, 5)
    val expected = Array(Array(1, 5), Array(6, 9))

    InsertInterval.insert(intervals, newInterval) shouldBe expected
  }

  "case 3" in {
    val intervals: Array[Array[Int]] = Array()
    val newInterval = Array(2, 5)
    val expected = Array(Array(2, 5))

    InsertInterval.insert(intervals, newInterval) shouldBe expected
  }

  "case 4" in {
    val intervals: Array[Array[Int]] = Array(Array(1, 5))
    val newInterval = Array(6, 8)
    val expected = Array(Array(1, 5), Array(6, 8))

    InsertInterval.insert(intervals, newInterval) shouldBe expected
  }

  "case 5" in {
    val intervals: Array[Array[Int]] = Array(Array(6, 8))
    val newInterval = Array(1, 5)
    val expected = Array(Array(1, 5), Array(6, 8))

    InsertInterval.insert(intervals, newInterval) shouldBe expected
  }

  "case 6" in {
    val intervals: Array[Array[Int]] = Array(Array(1, 5))
    val newInterval = Array(2, 3)
    val expected = Array(Array(1, 5))

    InsertInterval.insert(intervals, newInterval) shouldBe expected
  }

  "case 7" in {
    val intervals: Array[Array[Int]] = Array(Array(3, 5), Array(11,12))
    val newInterval = Array(6, 6)
    val expected = Array(Array(3, 5), Array(6, 6), Array(11, 12))

    InsertInterval.insert(intervals, newInterval) shouldBe expected
  }
}
