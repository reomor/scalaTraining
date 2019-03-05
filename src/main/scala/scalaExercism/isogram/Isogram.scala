package scalaExercism.isogram

object Isogram {
  def isIsogram(string: String): Boolean = {
    string.toLowerCase()
      .replaceAll("[\\s-]", "")
      .toSet.size == string.replaceAll("[\\s-]", "").length
  }
}
