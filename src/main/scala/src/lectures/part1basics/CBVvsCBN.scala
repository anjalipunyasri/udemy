package src.lectures.part1basics

object CBVvsCBN extends App{
  def callByValue(x: Long): Unit = {
    println("by value:"+x)
    println("by value:"+x)
  }
  def callByName(x: => Long):Unit = {
    println("By reference"+x)
    println("By reference"+x)
  }
  callByValue(System.nanoTime())
  callByName(System.nanoTime())


  def infinite(): Int =1 + infinite()
  def printFirst(x: Int,y: =>Int) = println(x)
  printFirst(34,infinite())



}
