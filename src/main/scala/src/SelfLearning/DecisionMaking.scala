package src.SelfLearning

object DecisionMaking extends App {

  //Decision making statements in scala are :
  //If   If-else    Nested-If    If-elseif ladder
  //Scala uses control statements to control the flow of execution of the program based on certain conditions.
  //These are used to cause the flow of execution to advance and branch based on changes to the state of a program.

  // If statement
  var x: Int =40
  if(x > 25) {
    println("If statement is executed")
  }


  // If and If-else
  var a : Int = 450
  if(a % 2 == 0)
    println("Even number")
  if (a > 450)
    println("New Website")
  else
    println("Execute this statement")


  //nested-if
  var b : Int = 15
  if(b % 3 == 0){
    if(b % 5 == 0)
      println("This statement was divisible by 3 and 5")
  }

  // nested if-else
  var e: Int = 20
  var f: Int = 40
  var g: Int = 60
  if(e > f){
    if(e > g)
      println("e is the largest among other two : " + e)
    else
      println("g is the largest among other two : " + g)
  }
  else{
    if(f > g)
      println("f is the largest among other two : " + f)
    else
      println("g is the largest among other two : " + g)
  }


  //if-else-if-ladder
  var value: Int = 25
  if(value == 20)
    println("Value is 20")
  else if(value == 26)
    println("value is 26")
  else if(value == 25)
    println("Value is 25")
  else
    println("No match found")
}
