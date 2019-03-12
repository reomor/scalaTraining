package scalaExercism.anagram

class Anagram {

}

object Anagram {
  def findAnagrams(etalon: String, words: List[String]): List[String] = {
    def detectAnagram(etalon: String, checkWord: String): Boolean = {
      val etalonCased = etalon.toLowerCase
      val checkWordCased = checkWord.toLowerCase
      if (etalonCased.length != checkWordCased.length || etalonCased.equals(checkWordCased)) {
        false
      } else {
        etalonCased.sorted.equals(checkWordCased.sorted)
      }
    }
    words.filter(word => detectAnagram(etalon, word))
  }
}
