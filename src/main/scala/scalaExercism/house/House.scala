package scalaExercism.house

class House {

}
object House {
  def tale(current: Int, max: Int): String = {
    if (current == max) {
      current match {
        case 1 => "This is the house that Jack built."
        case 2 => "This is the malt"
        case 3 => "This is the rat"
        case 4 => "This is the cat"
        case 5 => "This is the dog"
        case 6 => "This is the cow with the crumpled horn"
        case 7 => "This is the maiden all forlorn"
        case 8 => "This is the man all tattered and torn"
        case 9 => "This is the priest all shaven and shorn"
        case 10 => "This is the rooster that crowed in the morn"
        case 11 => "This is the farmer sowing his corn"
        case 12 => "This is the horse and the hound and the horn"
        case _ => ""
      }
    } else {
      current match {
        case 1 => "that lay in the house that Jack built."
        case 2 => "that ate the malt"
        case 3 => "that killed the rat"
        case 4 => "that worried the cat"
        case 5 => "that tossed the dog"
        case 6 => "that milked the cow with the crumpled horn"
        case 7 => "that kissed the maiden all forlorn"
        case 8 => "that married the man all tattered and torn"
        case 9 => "that woke the priest all shaven and shorn"
        case 10 => "that kept the rooster that crowed in the morn"
        case 11 => "that belonged to the farmer sowing his corn"
        case _ => ""
      }
    }
  }
  def taleRecursion(current: Int, max: Int, result: List[String]): String = {
    if (current == 0) {
      result.mkString(" ")
    } else {
      taleRecursion(current - 1, max, result :+ tale(current, max))
    }
  }
  def talesRecursion(current: Int, finish: Int, result: List[String]): String = {
    if (current == finish + 1) {
      result.mkString("\n") + "\n\n"
    } else {
      talesRecursion(current + 1, finish, result :+ taleRecursion(current, current, Nil))
    }
  }
  def recite(start: Int, finish: Int): String = {
    talesRecursion(start, finish, Nil)
  }

  def main(args: Array[String]): Unit = {
    val str = recite(1, 1)
    println(str)
  }
}

