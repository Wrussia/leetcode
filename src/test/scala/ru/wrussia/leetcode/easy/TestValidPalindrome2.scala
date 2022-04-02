package ru.wrussia.leetcode.easy

import org.scalatest.{Matchers, WordSpecLike}

class TestValidPalindrome2 extends WordSpecLike with Matchers {
  "case 1" in {
    ValidPalindrome2.validPalindrome("aba") shouldBe true
  }
  "case 2" in {
    ValidPalindrome2.validPalindrome("abc") shouldBe false
  }
  "case 3" in {
    ValidPalindrome2.validPalindrome("abca") shouldBe true
  }
  "case 4" in {
    ValidPalindrome2.validPalindrome("acbba") shouldBe true
  }
  "case 6" in {
    ValidPalindrome2.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga") shouldBe true
  }
}
