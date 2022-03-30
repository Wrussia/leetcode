package ru.wrussia.leetcode.easy

import org.scalatest.{Matchers, WordSpecLike}

class TestMaximumSubarray extends WordSpecLike with Matchers {
  "case 1" in {
    MaximumSubarray.maxSubArray(Array(-2,1,-3,4,-1,2,1,-5,4)) shouldBe 6
  }
  "case 2" in {
    MaximumSubarray.maxSubArray(Array(5,4,-1,7,8)) shouldBe 23
  }
  "case 3" in {
    MaximumSubarray.maxSubArray(Array(-2,-3,-4,-5,-1)) shouldBe -1
  }
}
