package src.lectures.part2oop

import org.jcp.xml.dsig.internal.dom.DOMSubTreeData

object AbstractDataTypes extends App{
  // abstract
  abstract class Animal{
    val creatureType: String = "Wild"
    def eat : Unit
  }
  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override def eat: Unit = println("crunch crunch")
  }
  //traits
  trait Carnivore{
    def eat (animal: Animal): Unit
    val preferredMeal: String = "Fresh meat"
  }
  trait coldBlooded
  class Crocodile extends Animal with Carnivore with coldBlooded{
    override val creatureType: String = "croc"
    def eat: Unit = println("nomnomnom")
    def eat(animal:Animal): Unit= println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }
  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  //traits vs abstract class
  //1. traits do not have constructor parameters
  //2. multiple traits may be inherited by the same class
  //3. traits= behaviour,abstract class = "thing"


}
