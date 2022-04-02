package ru.wrussia.leetcode.medium

import org.scalatest.{Matchers, WordSpecLike}

class TestRangeAddition extends WordSpecLike with Matchers {
  "case 1" in {
    val input = Array(Array(1, 2, 100),
    Array(2, 5, 100),
    Array(3, 4, 100))
    RangeAddition.arrayManipulation(5, input) shouldBe 200
  }
}
