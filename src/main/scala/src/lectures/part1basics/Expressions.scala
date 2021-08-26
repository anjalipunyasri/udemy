package src.lectures.part1basics

object Expressions extends App {
  val x=1+2//expression
  println(x)
  println(2+3*4)
  // math operators are + - * / & | >> << >>>(right shift with zero extension)
  println(1 == x)
  // relational operators == != > >= < <=
  println(!(1 ==x))
  // unary operators ! && ||
  var aVariable =2
  aVariable +=3 // also works with -= *= /=..... side effects
  println(aVariable)
  // Instructions(Do) vs Expressions(Value)
  // Instructions means do something expressions means giving value of something
  // If expression
  val aCondition= true
  val aConditionedValue= if(aCondition) 5 else 3 //If expression
  println(aConditionedValue)
  println(if(aCondition)5 else 3)
  println(1+3)
  //while loop
  var i=0
  while(i<10){
    println(i)
     i+=1
  }
  // everything im scala is an expression
  val aWeirdValue = (aVariable =3)// Unit === void
  println(aWeirdValue)
  // side effects are println(), whiles, reassigning

  // code blocks
  val aCodeBlock={
    val y=2
    val z=y+1
    if(z>2)"hello" else "Bye for now"
  }
  //val anotherValue = z+1




  //1. diff btwn "hello world" vs println("hello world")?
  //1. Answer
  // "hello world" is a value of type string . println("Hello world") is an expressions which is a side effect
  // 2.

  val someValue = {
    2 < 3
  }
  println(someValue)
  val someOtherValue ={
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)
}
