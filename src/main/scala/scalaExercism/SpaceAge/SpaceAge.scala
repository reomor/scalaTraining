package scalaExercism.SpaceAge

class SpaceAge {
}

object EarthYearRelateToPlanet {
  val Mercury = 0.2408467
  val Venus = 0.61519726
  val Mars = 1.8808158
  val Jupiter = 11.862615
  val Saturn = 29.447498
  val Uranus =  84.016846
  val Neptune = 164.79132
}

object SpaceAge {
  val EarthSecondsInOneYear = 31557600

  def relativeToEarth(ageInSeconds: Double, ratio: Double): Double = {
    onEarth(ageInSeconds) / ratio
  }

  def onEarth(ageInSeconds: Double): Double = {
    ageInSeconds / EarthSecondsInOneYear
  }

  def onMercury(ageInSeconds: Double): Double = {
    relativeToEarth(ageInSeconds, EarthYearRelateToPlanet.Mercury)
  }

  def onVenus(ageInSeconds: Double): Double = {
    relativeToEarth(ageInSeconds, EarthYearRelateToPlanet.Venus)
  }

  def onMars(ageInSeconds: Double): Double = {
    relativeToEarth(ageInSeconds, EarthYearRelateToPlanet.Mars)
  }

  def onJupiter(ageInSeconds: Double): Double = {
    relativeToEarth(ageInSeconds, EarthYearRelateToPlanet.Jupiter)
  }

  def onSaturn(ageInSeconds: Double): Double = {
    relativeToEarth(ageInSeconds, EarthYearRelateToPlanet.Saturn)
  }

  def onUranus(ageInSeconds: Double): Double = {
    relativeToEarth(ageInSeconds, EarthYearRelateToPlanet.Uranus)
  }

  def onNeptune(ageInSeconds: Double): Double = {
    relativeToEarth(ageInSeconds, EarthYearRelateToPlanet.Neptune)
  }
}
