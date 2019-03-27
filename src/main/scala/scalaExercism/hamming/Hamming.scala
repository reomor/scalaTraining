package scalaExercism.hamming

object Hamming {
  def distance(first: String, second: String): Option[Int] = {
    def distance(first: String, second: String): Option[Int] = {
      def hammingDifference(): Int = {
        first.zip(second).count(pair => pair._1 != pair._2)
      }
      if (first.length != second.length) {
        None
      } else {
        Option(hammingDifference())
      }
    }
  }
}
