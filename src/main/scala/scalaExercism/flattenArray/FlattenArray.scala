package scalaExercism.flattenArray

object FlattenArray {
  def flattenList(list: List[Any], result: List[Any]): List[Any] = {
    list match {
      case Nil => result
      case el :: listTail => el match {
        case item: Int => flattenList(listTail, result :+ item)
        case item: List[Any] => flattenList(listTail, result ++ flattenList(item, Nil))
      }
    }
  }

  def flatten(list: List[Any]): List[Any] = {
    flattenList(list, Nil)
  }
}
