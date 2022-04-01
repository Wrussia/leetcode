package ru.wrussia.leetcode.medium

import org.scalatest.{Matchers, WordSpecLike}

class Test3Sum extends WordSpecLike with Matchers {
  "case 1" in {
    ThreeSum.threeSum(Array(3,1,4,1,5,-6)) shouldBe List(List(-6,1,5))
  }
  "case 2" in {
    ThreeSum.threeSum(Array(0,0,0)) shouldBe List(List(0,0,0))
  }
}
