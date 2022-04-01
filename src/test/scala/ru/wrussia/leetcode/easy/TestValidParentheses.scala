package ru.wrussia.leetcode.easy

import org.scalatest.{Matchers, WordSpecLike}

class TestValidParentheses extends WordSpecLike with Matchers {
  "case 1" in {
    ValidParentheses.isValid("[ ( { } ) ]") shouldBe true
  }
  "case 2" in {
    ValidParentheses.isValid("( { } ) ]") shouldBe false
  }
  "case 3" in {
    ValidParentheses.isValid("[ { (  } ) ]") shouldBe false
  }
  "case 4" in {
    ValidParentheses.isValid("[") shouldBe false
  }
  "case 5" in {
    ValidParentheses.isValid("]") shouldBe false
  }
}
