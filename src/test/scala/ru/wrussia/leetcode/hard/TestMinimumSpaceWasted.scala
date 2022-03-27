package ru.wrussia.leetcode.hard

import org.scalatest.{Matchers, WordSpecLike}

class TestMinimumSpaceWasted extends WordSpecLike with Matchers {

  "simple" in {
    val packages: Array[Int] = Array(5,4,3,2,1)
    val boxes: Array[Array[Int]] = Array(Array(5))
    val packSum: BigInt = packages.map(BigInt(_)).sum

    MinimumSpaceWasted.boxKitTotalVolume(packages.sorted, boxes.head) shouldBe 25
    MinimumSpaceWasted.minWastedSpace(packages, boxes) shouldBe 10
  }
}
