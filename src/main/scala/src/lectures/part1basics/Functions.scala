package src.lectures.part1basics

object Functions extends App{
 def aFunction(a: String,b: Int): String = {
   a + " " + b
 }
 println(aFunction("hello",3))
  def aParameterlessFunction(): Int =42
  println(aParameterlessFunction())



  def aRepeatedFunction(aString: String, n:Int): String={
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello",3))
  // when you need loops, use recursion.

  def aFunctionWithSideEffects(aString: String):Unit= println(aString)
  def aBigFunction(n:Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n,n-1)
  }


  // a greeting function
  def aGreetingFunction(name:String, age: Int):String =
    "hI, MY NAME IS "+ name + " and I am " + age + "years old"
  println(aGreetingFunction("ANJALI",21))

  // factorial
  def factorial (n: Int): Int =
    if (n<=0) 1
    else n*factorial(n-1)
  println(factorial(5))

  // fibonacci
  def fibonacci(n: Int): Int =
    if (n<= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  println(fibonacci(8))


  //prime number
  def isPrime(n: Int): Boolean ={
    def isPrimeUntil(t: Int):Boolean =
      if(t<=1) true
      else n % t != 0 && isPrimeUntil(t-1)
    isPrimeUntil(n/2)
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(4))
}

