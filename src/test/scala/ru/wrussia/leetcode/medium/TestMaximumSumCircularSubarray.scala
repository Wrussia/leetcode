package ru.wrussia.leetcode.medium

import org.scalatest.{Matchers, WordSpecLike}

class TestMaximumSumCircularSubarray extends WordSpecLike with Matchers {
  "case 1" in {
    MaximumSumCircularSubarray.maxSubarraySumCircular(Array(-2,1,-3,4,-1,2,1,-5,4)) shouldBe 6
  }
  "case 2" in {
    MaximumSumCircularSubarray.maxSubarraySumCircular(Array(5,4,-100,7,8)) shouldBe 24
  }
  "case 3" in {
    MaximumSumCircularSubarray.maxSubarraySumCircular(Array(-2,-3,-4,-5,-1)) shouldBe -1
  }
  "case 4" in {
    MaximumSumCircularSubarray.maxSubarraySumCircular(Array(5,-10,5)) shouldBe 10
  }
  "case 5" in {
    MaximumSumCircularSubarray.maxSubarraySumCircular(Array(5,4,-100,100,-100,7,8)) shouldBe 100
  }
  "case 6" in {
    MaximumSumCircularSubarray.maxSubarraySumCircular(Array(5,-3,5)) shouldBe 10
  }
}
