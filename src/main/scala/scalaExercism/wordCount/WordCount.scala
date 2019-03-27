package scalaExercism.wordCount

class WordCount(val wordList: List[String]) {
  def countWords: Map[String, Int] = {
    wordList.filter(x => x.length != 0)
      .map(word => word.toLowerCase.replaceFirst("'(.*)'", "$1") -> 1)
      .groupBy(x => x._1)
      .map(x => x._1 -> x._2.length)
  }
}

object WordCount {
  def apply(string: String): WordCount = {
    new WordCount(string.replaceAll("[^\\w\\s',]", "").split("[\\s,]").toList)
  }
}
