package scalaExercism.collatzConjecture

class CollatzConjecture {

}

object CollatzConjecture {
  def steps(startingNumber: Int): Option[Int] = {
    def goCollatz(n: Int, stepsCount: Int): Int = {
      if (n == 1) stepsCount else {
        if (n % 2 == 0) {
          goCollatz(n / 2, stepsCount + 1)
        } else {
          goCollatz(3 * n + 1, stepsCount + 1)
        }
      }
    }
    if (startingNumber <= 0) None
    else Option(goCollatz(startingNumber, 0))
  }
}

