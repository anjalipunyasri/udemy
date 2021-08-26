package src.lectures.part2oop

object Objects extends App{
  // Scala does not have class level functionality("Static")
  object Person { // type + its only instance
    // "static"/"class" = level functionality
    val N_EYES =2
    def canFly: Boolean = false

    //factory method
    def apply(mother: Person, father: Person): Person= new Person("bobbie")
  }
  class Person(val name: String){
  //instance level functionality
  }
  //COMPANIONS

  println(Person.N_EYES)
  println(Person.canFly)

  // scala object = Singleton instance
  val mary = new Person("mary")
  val John=  new Person("John")
  println(mary == John)

  val person1 = Person
  val person2 = Person
  println(person1 == person2)

  val bobbie = Person(mary ,John)

  //scala applications = scala object with
  // def main(args:Array[String]):Unit
}
