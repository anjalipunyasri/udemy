package src.SelfLearning

object Arrays extends App{

  //Array is a special kind of collection in scala. it is a fixed size data structure that stores elements of the same data type.
  // It is a collection of mutable values.
  var name = Array("scala","course","program")
  println("Second element of an array is :")
  println(name(1))

  var days = Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
  println("Array elements are : ")
  for (m1 <- days) {
    println(m1)
  }
}
