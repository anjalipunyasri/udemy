package src.lectures.part2oop

object Generics extends App{
  class MyList[+A]{
    // use the type A
    def add[B >: A](element: B): MyList[A] = ???
    /*
    A-cat
    B-animal
     */
  }
  class MyMap[key,value]
  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //generic methods
  object MyList{
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  //variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //1. yes, List[Cat] extends List[Animal] = COVARIANCE
  class CovarianceList[+A]
  val animal: Animal = new Cat
  val animalList : CovarianceList[Animal] = new CovarianceList[Cat]
  //animalList.add(new Dog) ??? hard question => we return list of animals

  //2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. Hell, no! CONTRAVARIANCE
  class Trainer[-A]
  val Trainer: Trainer[Cat] = new Trainer[Animal]

  //bounded types
  class Cage[A <: Animal](animal:A)
  val cage = new Cage(new Dog)

  class Car
  //generic type needs proper bounded type
  //val newCage = new Cage(new Car)

  // expand MyList to be generic




}

