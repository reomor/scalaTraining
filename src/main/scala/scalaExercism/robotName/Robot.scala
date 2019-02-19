package scalaExercism.robotName

import scala.collection.mutable
import scala.util.Random

class Robot() {
  var name: String = generateUniqueName
  def generateName: (String, String) = {
    val random = new Random()
    val nameLetters = Random.alphanumeric.filter(_.isLetter).take(2).mkString.toUpperCase
    val nameDigits = (for (i <- 1 to 3) yield random.nextInt(10)).mkString
    nameLetters -> nameDigits
  }
  def checkUniqueName(tuple: (String, String)): Boolean = {
    Robot.unique.get(tuple._1) match {
      case Some(inner) => inner.get(tuple._2) match {
        case Some(value) => value
        case None =>
          Robot.unique(tuple._1).put(tuple._2, true)
          false
      }
      case None =>

        Robot.unique.put(tuple._1, new mutable.HashMap[String, Boolean]())
        Robot.unique.get(tuple._1).map(x => x.put(tuple._2, true))
        false
    }
  }
  def generateUniqueName: String = {
    var tuple = generateName
    while (checkUniqueName(tuple)) {
      tuple = generateName
    }
    tuple._1 + tuple._2
  }

  def reset(): Unit = {
    name = generateUniqueName
  }
}

object Robot {
  var unique = mutable.Map[String, mutable.Map[String, Boolean]]()
}
