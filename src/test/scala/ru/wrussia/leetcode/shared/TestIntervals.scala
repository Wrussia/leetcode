package ru.wrussia.leetcode.shared

import org.scalatest.{Matchers, WordSpecLike}

class TestIntervals extends WordSpecLike with Matchers {
  "intersection test" in {
    Intervals.intersects(1, 2, 2, 3) shouldBe true
    Intervals.intersects(3, 4, 1, 6) shouldBe true
    Intervals.intersects(2, 3, 1, 2) shouldBe true
    Intervals.intersects(1, 2, 3, 4) shouldBe false
    Intervals.intersects(3, 4, 1, 2) shouldBe false
  }
}
