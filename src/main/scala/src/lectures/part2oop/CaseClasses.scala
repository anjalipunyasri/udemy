package src.lectures.part2oop

object CaseClasses extends App{

  /* case classes are
  // equals, hashcode, toString
   */
  case class Person(name:String,age : Int)

  //1.class parameters are fields
  val jim = new Person (" Jim", 23)
  println(jim.name)

  //2.sensible toString
  //println(instance) = println(Instance.toString) // another form of syntactic sugar
  println(jim.toString)

  //3.equals and hashcode implemented OOTB
  val jim2 = new Person("Jim",23)
  println(jim == jim2)

  //4. CCs have handy copy method
  val jim3 = jim.copy(age = 45)
  println(jim3)

  //5. CCs have companion objects
  val thePerson = Person
  val mary = Person("mary",24)

  //6. CCs are serializable
  // Akka

  //7. CCs have extracted patterns . CCs can be used in pattern matching

  case object UnitedKingdom{
    def name : String = " The UK of GB and NI"
  }

  // Expand MyList use case classes and case objects
}
