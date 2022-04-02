package ru.wrussia.leetcode.hard

import scala.collection.mutable.ListBuffer

object RegularExpressionMatching {
  def strMatch(s:String, p: String): Boolean = {
    if (p.length > 1 && p(1) == '*') true
    else false
  }
  def rMatch(s: String, p: List[String]): Boolean = {
    false
  }

  def isMatch(s: String, p: String): Boolean = {
    val tokens = ListBuffer[String]()
    var tmpToken = ""
    var i = 0
    while (i < p.length - 1) {
      if (p(i + 1) != '*') {
        tmpToken+=p(i)
        i += 1
      } else {
        if (tmpToken.nonEmpty) tokens += tmpToken
        tokens += p(i) + "*"
        i += 2
      }
    }
    if (p.last != '*') tokens += tmpToken + p.last
    println(tokens.mkString(";"))



    false
  }
}
