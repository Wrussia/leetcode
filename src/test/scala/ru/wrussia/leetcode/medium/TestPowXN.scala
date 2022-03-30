package ru.wrussia.leetcode.medium

import org.scalatest.{Matchers, WordSpecLike}

class TestPowXN extends WordSpecLike with Matchers {
  "case 1" in {
    PowXN.myPow(2, 2) shouldBe 4
  }
  "case 2" in {
    PowXN.myPow(2, -2) shouldBe 0.25
  }
  "case 3" in {
    PowXN.myPow(2, 11) shouldBe 2048
  }
  "case 4" in {
    PowXN.myPow(2, 15) shouldBe 32768
  }
  "case 5" in {
    PowXN.myPow(-1, 15) shouldBe -1
  }
  "case 6" in {
    PowXN.myPow(-1, 16) shouldBe 1
  }
  "case 7" in {
    PowXN.myPow(2.0,-2147483648) shouldBe 0
  }
  "case 8" in {
    PowXN.myPow(0.15,0) shouldBe 1
  }
  "test nonRec" in {
    PowXN.nonRecPow(2, 2) shouldBe 4
    PowXN.nonRecPow(2, -2) shouldBe 0.25
    PowXN.nonRecPow(2, 11) shouldBe 2048
    PowXN.nonRecPow(2, 15) shouldBe 32768
    PowXN.nonRecPow(-1, 16) shouldBe 1
    PowXN.nonRecPow(2.0,-2147483648) shouldBe 0
    PowXN.nonRecPow(0.15,0) shouldBe 1
  }

}
