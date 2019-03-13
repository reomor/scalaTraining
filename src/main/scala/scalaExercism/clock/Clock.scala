package scalaExercism.clock

class Clock(val hours: Int, val minutes: Int) {
  def this(minutes: Int) {
    this(0, minutes)
  }

  def +(that: Clock): Clock = {
    simplify(hours + that.hours, minutes + that.minutes)
  }

  def -(that: Clock): Clock = {
    simplify(hours - that.hours, minutes - that.minutes)
  }

  private def simplify(hours: Int, minutes: Int): Clock = {
    val hoursFromMinutes = minutes / 60
    val simplifyMinutes = if (minutes < 0) {
      (hoursFromMinutes - 1, (Math.abs(hoursFromMinutes) + 1) * 60 - Math.abs(minutes))
    } else {
      (hoursFromMinutes, minutes - hoursFromMinutes * 60)
    }
    val hoursWithHoursFromMinutes = hours + simplifyMinutes._1
    val hoursToDays = hoursWithHoursFromMinutes / 24
    val simplifyHours = if (hoursWithHoursFromMinutes < 0) {
      (Math.abs(hoursToDays) + 1) * 24 - Math.abs(hoursWithHoursFromMinutes)
    } else {
      hoursWithHoursFromMinutes - hoursToDays * 24
    }
    Clock(simplifyHours, simplifyMinutes._2)
  }

  def canEqual(a: Any): Boolean = a.isInstanceOf[Clock]

  override def equals(obj: Any): Boolean = {
    obj match {
      case that: Clock => that.canEqual(this) && hashCode() == that.hashCode()
      case _ => false
    }
  }

  override def hashCode(): Int = {
    val prime = 67
    val clock = simplify(this.hours, this.minutes)
    prime * clock.hours + clock.minutes
  }
}

object Clock {
  def apply(hours: Int, minutes: Int): Clock = {
    new Clock(hours, minutes)
  }

  def apply(minutes: Int): Clock = {
    new Clock(minutes)
  }
}

