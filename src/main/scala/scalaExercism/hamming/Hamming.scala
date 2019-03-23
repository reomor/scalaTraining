package scalaExercism.hamming

import scala.annotation.tailrec

object Hamming {
  def distance(first: String, second: String): Option[Int] = {
    @tailrec
    def hammingDifference(index: Int, limit: Int, count: Int): Int = {
      if (index >= limit) {
        count
      } else {
        if (first.charAt(index) == second.charAt(index)) {
          hammingDifference(index + 1, limit, count)
        } else {
          hammingDifference(index + 1, limit, count + 1)
        }
      }
    }
    if (first.length != second.length) {
      None
    } else {
      Option(hammingDifference(0, first.length, 0))
    }
  }
}
