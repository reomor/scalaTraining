package scalaExercism.raindrops

object Raindrops {
  private def checkDividers(dividend: Int, dividersList: Seq[(Int, String)], rain: List[String]): List[String] = {
    dividersList match {
      case Nil => rain
      case divider :: listTail => {
        if (dividend % divider._1 == 0) {
          checkDividers(dividend, listTail, rain :+ divider._2)
        } else {
          checkDividers(dividend, listTail, rain)
        }
      }
    }
  }

  def convert(n: Int): String = {
    val dividers = Seq(3 -> "Pling", 5 -> "Plang", 7 -> "Plong")
    val strings = checkDividers(n, dividers, Nil)
    if (strings == Nil) {
      n.toString
    } else {
      strings.mkString("")
    }
  }
}

