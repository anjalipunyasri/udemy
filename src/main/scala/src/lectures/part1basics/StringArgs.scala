package src.lectures.part1basics

object StringArgs extends App{
  val str: String="HELLO you are learning scala"
  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("HELLO"))
  println(str.replace("you","we"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString= "2"
  val aNumber= aNumberString.toInt
  println('a'+: aNumberString:+ 'z')
  println(str.reverse)
  println(str.take(2))

  //String interpolators
  //s-interpolators

  val name="Anjali"
  val age=21
  val greeting = s"Hello, my name is $name and i am $age years old"
  val anotherGreeting = s"Hello, my name is $name and i will be turning ${age + 1} years"
  println(greeting)
  println(anotherGreeting)


  //F-interpolators
  val speed=1.2f
  val myth= f"$name%s can eat $speed%2.2f burgers per minute"
  println(myth)


  //raw interpolators
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}
