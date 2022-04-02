package ru.wrussia.leetcode.medium

import org.scalatest.{Matchers, WordSpecLike}

class TestCountPrimes  extends WordSpecLike with Matchers {

  "case 1" in {
   CountPrimes.countPrimes(17) shouldBe 6
  }
  "case 2" in {
   CountPrimes.countPrimes(1) shouldBe 0
  }
  "case 3" in {
   CountPrimes.countPrimes(2) shouldBe 0
  }
  "case 4" in {
   CountPrimes.countPrimes(10) shouldBe 4
  }
  "case 5" in {
   CountPrimes.countPrimes(3) shouldBe 1
  }
  "case 6" in {
   CountPrimes.countPrimes(5) shouldBe 2
  }
}
