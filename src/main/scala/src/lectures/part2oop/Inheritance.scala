package src.lectures.part2oop

object Inheritance extends App{
  //single class inheritance
  class Animal{
    val creatureType = "wild"
    def eat = println("nomnom")
  }
  class Cat extends Animal{
    def crunch = {
      cat
      println("crunch crunch")
    }
  }
  val cat = new Cat
  cat.crunch

  //constructors
  class Person(name:String, age:Int)
  {
    def this(name:String) = this(name,0)
  }
  class Adult(name:String,age:Int,IdCard:String) extends Person(name)

  //overriding
  class Dog(override val creatureType : String) extends Animal {
   // override val creatureType = "domestic"
    override def eat = {
      super.eat
      println("crunch-crunch")
    }
  }
  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  //type substitution (broad:polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  //overriding vs overloading

  //super
  // super is used when you want to refer a method or field from parent class

  //preventing overrides
  //1. way is used to use keyword final on member
  //2. Use final on the entire class
  //3. Seal the class = extend classes in THIS FILE , prevent extension in other files

}
