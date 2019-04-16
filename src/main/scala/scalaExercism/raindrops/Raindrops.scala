package scalaExercism.raindrops

object Raindrops {
  def convert(n: Int): String = {
    val result = List(3, 5, 7).filter(divider => n % divider == 0).map {
      case 3 => "Pling"
      case 5 => "Plang"
      case 7 => "Plong"
      case _ => ""
    }.mkString("")
    if (result.isEmpty) {
      n.toString
    } else {
      result
    }
  }
}