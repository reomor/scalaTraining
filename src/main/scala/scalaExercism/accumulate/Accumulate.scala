package scalaExercism.accumulate

import scala.annotation.tailrec

class Accumulate {
  def accumulate[A, B](f: (A) => B, list : List[A]): List[B] = {
    @tailrec
    def tailAccumulate(f: (A) => B, list: List[A], result: List[B]): List[B] = {
      list match {
        case Nil => result.reverse
        case x :: tailList => tailAccumulate(f, tailList, f(x) :: result)
      }
    }
    tailAccumulate(f, list, Nil)
  }
}
