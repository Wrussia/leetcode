package ru.wrussia.leetcode.easy

import org.scalatest.{Matchers, WordSpecLike}

class TestRemoveElement extends WordSpecLike with Matchers {
  "case 1" in {
    RemoveElement.removeElement(Array(3,2,2,3), 3) shouldBe 2
  }
  "case 2" in {
    RemoveElement.removeElement(Array(0,1,2,2,3,0,4,2), 2) shouldBe 5
  }
}
