package scalaExercism.sieve

class Sieve {
}

object Sieve {
  type SieveElement = (Int, Boolean)

  def primes(limit: Int): List[Int] = {
    val list = (2 to limit).map(x => new SieveElement(x, false)).toBuffer
    for(i <- 2 to limit) {
      for (j <- i - 2 + 1 to limit - 2) {
        if (list(j)._1 % i == 0) {
          list(j) = new SieveElement(list(j)._1, true)
        }
      }
    }
    list.filter(x => !x._2).map(x => x._1).toList
  }
}

