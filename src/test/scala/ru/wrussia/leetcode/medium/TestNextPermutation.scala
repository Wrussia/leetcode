package ru.wrussia.leetcode.medium

import org.scalatest.{Matchers, WordSpecLike}

class TestNextPermutation extends WordSpecLike with Matchers {
  "binarySearch 1" in {
    NextPermutation.binarySearch(Array(4,3,2,1), 2) shouldBe 2
  }
  "binarySearch 2" in {
    NextPermutation.binarySearch(Array(1,4,3,2,1), 2, 1) shouldBe 3
  }
  "binarySearch 3" in {
    NextPermutation.binarySearch(Array(1,4,3,2,1), 4, 1) shouldBe 1
  }
  "binarySearch 4" in {
    NextPermutation.binarySearch(Array(1,4,3,2), 1, 1) shouldBe 3
  }
  "binarySearch 5" in {
    NextPermutation.binarySearch(Array(1,6,3,2), 4, 1) shouldBe 1
  }
  "binarySearch 6" in {
    NextPermutation.binarySearch(Array(1,6,3,2,1), 4, 1) shouldBe 1
  }
  "binarySearch 7 " in {
    NextPermutation.binarySearch(Array(1,5,1), 2, 1) shouldBe 1
  }
  "case 1" in {
    NextPermutation.nextPermutation(Array(1,2,3)) shouldBe Array(1,3,2)
  }
  "case 2" in {
    NextPermutation.nextPermutation(Array(2,3,1)) shouldBe Array(3,1,2)
  }
  "case 3" in {
    NextPermutation.nextPermutation(Array(3,2,1)) shouldBe Array(1,2,3)
  }
  "case 4" in {
    NextPermutation.nextPermutation(Array(1,2,5,4)) shouldBe Array(1,4,2,5)
  }
  "case 5" in {
    NextPermutation.nextPermutation(Array(2,3,1,0)) shouldBe Array(3,0,1,2)
  }
  "case 6" in {
    NextPermutation.nextPermutation(Array(3,8,11,10,9,8,7,6,5)) shouldBe Array(3,9,5,6,7,8,8,10,11)
  }
  "case 7" in {
    NextPermutation.nextPermutation(Array(1,5,1)) shouldBe Array(5,1,1)
  }
  "case 8" in {
    NextPermutation.nextPermutation(Array(2,1,2,2,2,2,2,1)) shouldBe Array(2,2,1,1,2,2,2,2)
  }


}
