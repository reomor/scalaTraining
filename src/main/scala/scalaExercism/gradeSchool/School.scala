package scalaExercism.gradeSchool

class School {
  type DB = Map[Int, Seq[String]]
  val internalDB = collection.mutable.HashMap.empty[Int, Seq[String]]

  def add(name: String, g: Int): Unit = {
    internalDB.get(g) match {
      case Some(value) => internalDB.update(g, value :+ name)
      case None => internalDB += (g -> Seq(name))
    }
    ()
  }

  def db: DB = {
    internalDB.map(kv => (kv._1, kv._2)).toMap
  }

  def grade(g: Int): Seq[String] = {
    internalDB.get(g) match {
      case Some(value) => value
      case None => Seq()
    }
  }

  def sorted: DB = {
    internalDB.toList.sortWith(_._1 < _._1).toMap.map(kv => (kv._1, kv._2.sorted))
  }
}
