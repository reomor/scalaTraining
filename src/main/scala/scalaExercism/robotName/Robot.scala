package scalaExercism.robotName

import scala.util.Random

class Robot() {
  var name: String = generateName
  def generateName: String = {
    val random = new Random()
    Random.alphanumeric.filter(_.isLetter).take(2).mkString.toUpperCase +
      (for(i <- 1 to 3) yield random.nextInt(10)).mkString
  }
  def reset(): Unit = {
    name = generateName
  }
}

