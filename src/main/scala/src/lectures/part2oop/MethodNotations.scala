package src.lectures.part2oop

object MethodNotations extends App{
  class Person (val name:String,favouriteMovie:String,val age:Int = 0 ){
    def likes(movie: String): Boolean = movie == favouriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favouriteMovie)
    def unary_! : String = s"$name, what the heck?!"
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and i like $favouriteMovie"
    def apply(n:Int): String = s"$name watched $favouriteMovie $n times"
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"
  }
  val mary= new Person("mary","Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  //infix notation = operator notation
  // the style of writing methods in infix notation is called syntactic sugar

  //operators in scala
  val tom = new Person("Tom","Fight club")
  println(mary + tom)
  println(mary.+(tom))

  println(1+2)
  println(1.+(2))
  //all operators are methods in scala


  //prefix notation
  //prefix notation is another form of syntactic sugar it talks about unary operators
  val x = -1// equivalent with 1.unary_-
  val y = 1.unary_-// unary methods are operators with unary underscore as prefix
  // unary_prefix only works with - + ~ !
  println(!mary)
  println(mary.unary_!)


  //postfix notation
  // the functions that will receive any parameters have the property of postfix notation.
  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary())//equivalent

  /*
  1.overload the + operator
      mary + "the rockstar" => new person "Mary (the rockstar)"
  */
  // answer
  println((mary + "The rockstar").apply())
  println((+mary).age)
  println(mary learnsScala)
  println(mary(10))
  /*
  2. Add an age to the Person class
  -add a unary + operator => new person with age + 1
  +mary => mary with the age increment
  */
  /*
  3. Add a "learns" method in the Person class => "Mary learns scala"
  Add an learnsScala method, calls learns method with "Scala".
  Use it in postfix notation.
  */
  /*
  4. Overload the apply method
  mary.apply(2) => "Mary watched Inception 2 times "
     */


}
