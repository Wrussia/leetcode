package ru.wrussia.leetcode.medium

object CountPrimes {
  def countPrimes(n: Int): Int = {
    val primes = Array.fill(n)(true)
    var i = 2
    if (n <= 2) return 0
    else {
      primes(0) = false
      primes(1) = false
    }
    while (i < n / 2 + 1) {
      if (primes(i)) {
        var j = 2
        while (j * i < n) {
          primes(j * i) = false
          j += 1
        }
      }
      i += 1
    }

    primes.count(isPrime => isPrime)
  }
}
