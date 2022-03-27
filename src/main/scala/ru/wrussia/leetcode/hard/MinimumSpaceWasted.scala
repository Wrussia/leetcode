package ru.wrussia.leetcode.hard

import ru.wrussia.leetcode.shared.BinarySearch.binarySearch

object MinimumSpaceWasted {
  def boxKitTotalVolume(packages: Array[Int], boxes: Array[Int]): BigInt = {
    if (packages.last > boxes.last) return -1L

    var boxSpace: BigInt = 0
    var start = 0

    for (box <- boxes) {
      val end = binarySearch(packages, box, start) + 1
      if (end > 0 && end <= packages.length) {
        boxSpace += BigInt(end - start) * BigInt(box)
        start = end
      }
    }

    boxSpace
  }

  def minWastedSpace(packages: Array[Int], boxes: Array[Array[Int]]): Int = {
    var minWaste: BigInt = -1L
    val sortedPackages = packages.sorted
    val packSum: BigInt = packages.map(BigInt(_)).sum

    for (boxKit <- boxes) {
      val sortedBoxKit = boxKit.sorted
      val boxKitWaste = boxKitTotalVolume(sortedPackages, sortedBoxKit) - packSum

      if (minWaste == -1 || (boxKitWaste >= 0 && boxKitWaste < minWaste)) {
        minWaste = boxKitWaste
      }

      if (minWaste == 0) return 0
    }
    (minWaste.toLong % (1e9 + 7)).toInt
  }
}
