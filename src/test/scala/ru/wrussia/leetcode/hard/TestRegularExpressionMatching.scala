package ru.wrussia.leetcode.hard

import org.scalatest.{Matchers, WordSpecLike}

class TestRegularExpressionMatching extends WordSpecLike with Matchers {

  "case 1" in {
    RegularExpressionMatching.isMatch("aab", "a*b") shouldBe true
    RegularExpressionMatching.isMatch("b", "a*b") shouldBe true
    RegularExpressionMatching.isMatch("ba", "a*b") shouldBe false
    RegularExpressionMatching.isMatch("akb", "a.b") shouldBe true
  }
}