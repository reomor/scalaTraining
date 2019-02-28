package scalaExercism.armstrongNumber

import scala.annotation.tailrec

class ArmstrongNumbers {
}

object ArmstrongNumbers {
  def isArmstrongNumber(number: Int): Boolean = {
    val length = number.toString.length

    @tailrec
    def armstrong(position: Int, length: Int, number: Int, sum: BigDecimal): BigDecimal = {
      if (position == length)
        sum
      else {
        val digit: Int = Math.floorMod(number, 10)
        armstrong(position + 1, length, number / 10, sum + BigDecimal(digit).pow(length))
      }
    }
    armstrong(0, length, number, 0).toInt == number
  }
}

