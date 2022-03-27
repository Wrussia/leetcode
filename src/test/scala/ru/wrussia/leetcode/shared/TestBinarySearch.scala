package ru.wrussia.leetcode.shared

import org.scalatest.{Matchers, WordSpecLike}
import ru.wrussia.leetcode.shared.BinarySearch.binarySearch

class TestBinarySearch extends WordSpecLike with Matchers{
  "simple" in {
    binarySearch(Array(1,2,3,4,5), 3) shouldBe 2
  }
}
