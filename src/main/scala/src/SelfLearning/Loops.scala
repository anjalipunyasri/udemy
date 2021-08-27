package src.SelfLearning

object Loops extends App{

  // Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly while some condition evaluates to true.
  // Loops make the programmer’s task simpler.

  //for loop
  var a = 0
  for(a <-1 to 10){
    println("Value of a is : " + a)
  }

  //while loop
  var b= 1
  while(b <= 10){
    println("Value of b is: " + b)
    b = b + 1
  }

  //do-while loop
  var c = 10
  do{
    print(c + " ")
    c = c - 1
  }
  while(c > 0)

/*
  //infinite while loop
  var d = 1
  while(d < 5){
    println("Scala Program")
  }

 */

  //nested loops
  var x = 3
  var y = 0
  while(x < 5){
    y = 0
    while(y < 5){
      println("value of x = " +x, " y = "+y)
      y = y + 1
    }
    println()
    x = x + 1
    println("Value of x Become: "+x)
    println()
  }
}
