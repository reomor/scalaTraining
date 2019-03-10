package scalaExercism.gradeSchool

import scala.collection.Map

class School {
  type DB = Map[Int, Seq[String]]
  val internalDB = collection.mutable.SortedMap.empty[Int, Seq[String]]

  def add(name: String, g: Int): Unit = {
    internalDB.get(g) match {
      case Some(value) => internalDB.update(g, value :+ name)
      case None => internalDB += (g -> Seq(name))
    }
  }

  def db: DB = {
    internalDB
  }

  def grade(g: Int): Seq[String] = {
    internalDB.getOrElse(g, Seq())
  }

  def sorted: DB = {
    internalDB.map(kv => (kv._1, kv._2.sorted))
  }
}
