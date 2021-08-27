package src.SelfLearning

//Fields
//These variables can be accessed inside a method and invoked this from an object by creating reference.
object ScopeOfVariable extends App{
  val Example = new display()
  Example.value()
}
class display{
  var x = 200.76f
  var y = 78f
  def value(): Unit =
  {
    println("value of x is :" +x)
  }
  println("value of Y is:"+y)
  //Method parameters
  //Here the multiply method accepting two method parameter variables a and b. Rectangle method is invoking by passing the values to variables a and b.
  val scope = new rectangle()
  scope.multiply(2,20)
  class rectangle{
    def multiply(a: Int, b: Int): Unit =
    {
      var result = a * b
      println("Area is"+ result)
    }
  }


  //Local variables
  //
  val local = new Area()
  local.multi()
  class Area{
    def multi(): Unit ={
      var(c,d) = (3,30)
      var a = c * d
      println("Area is:"+ a)
    }
  }

}

