package scalaExercism.bob

object Bob {
  def response(statement: String): String = {
    statement match {
      case s if s.matches("\\s*") => "Fine. Be that way!"
      case s if s.matches("[A-Z\\s]*\\?$") => "Calm down, I know what I'm doing!"
      case s if s.matches(".*(\\?\\s*)$") => "Sure."
      case s if s.matches( "[A-Z\\s!]*!?$") | s.replaceAll("([$&+,:;=?@#|'<>.^*()%-])", "A").matches( "[A-Z\\d\\s,!]*!$") => "Whoa, chill out!"
      case _ => "Whatever."
    }
  }
}
