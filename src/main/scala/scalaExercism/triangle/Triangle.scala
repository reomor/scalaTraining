package scalaExercism.triangle

case class Triangle(a: Double, b: Double, c: Double) {
  def generalConditions: Boolean = {
    a > 0 && b > 0 && c > 0 && (a + b >= c) && (a + c >= b) && (b + c >= a)
  }
  def equilateral: Boolean = {
    generalConditions && a == b && b == c
  }
  def isosceles: Boolean = {
    generalConditions && (a == b || b == c || a == c)
  }
  def scalene: Boolean = {
    generalConditions && a != b && a != c && b != c
  }
}
