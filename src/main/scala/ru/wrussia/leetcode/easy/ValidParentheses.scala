package ru.wrussia.leetcode.easy

import scala.collection.mutable

object ValidParentheses {

  def isValid(s: String): Boolean = {
    val closeQueue = mutable.Stack[Char]()
    val openSet = Set('{', '[', '(')
    val closeSet = Set('}', ']', ')')
    for (ch <- s) {

      if (openSet.contains(ch)) closeQueue.push(ch match {
        case '{' => '}'
        case '(' => ')'
        case '[' => ']'})
      else if (closeSet.contains(ch) && (closeQueue.isEmpty || closeQueue.pop() != ch)) return false
    }

    closeQueue.isEmpty
  }
}
