package scalaExercism.sumOfMultiples

object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    val result = (1 until limit)
      .flatMap(i => factors.filter(factor => i % factor == 0).map(factor => i))
    result.sum
  }
}

