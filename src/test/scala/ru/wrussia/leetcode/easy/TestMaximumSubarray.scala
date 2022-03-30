package ru.wrussia.leetcode.easy

import org.scalatest.{Matchers, WordSpecLike}

class TestMaximumSubarray extends WordSpecLike with Matchers {
  "simple" in {
    MaximumSubarray.maxSubArray(Array(-2,1,-3,4,-1,2,1,-5,4)) shouldBe 6
  }
}
