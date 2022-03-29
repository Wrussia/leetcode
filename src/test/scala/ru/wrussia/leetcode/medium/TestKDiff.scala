package ru.wrussia.leetcode.medium

import org.scalatest.{Matchers, WordSpecLike}

class TestKDiff extends WordSpecLike with Matchers {
  "case 1" in {
    KDiff.findPairs(Array(3,1,4,1,5), 2) shouldBe 2
  }
  "case 2" in {
    KDiff.findPairs(Array(1,3,1,5,4), 0) shouldBe 1
  }
  "case 3" in {
    KDiff.findPairs(Array(1,2,3,4,5), 1) shouldBe 4
  }
  "case 4" in {
    KDiff.findPairs(Array(1,2,3,4,5), -1) shouldBe 4
  }
}
