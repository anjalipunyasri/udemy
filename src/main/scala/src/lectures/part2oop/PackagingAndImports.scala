package src.lectures.part2oop

import src.playground.{Cindrella => Princess, PrinceCharming}

import java.util.Date
import java.sql.{Date => SqlDate}

object PackagingAndImports extends App{
  //package members are accessible by their simple name
  val writer = new Writer("Richard","JVM",2018)

  //import the package
  val princess = new Princess // playground.Cindrella = fully qualified name

  // packages are hierarchy
  //matching folder structure.

  //package object
  sayHello
  println(SPEED_OF_LIGHT)

  //imports
  val prince = new PrinceCharming

  //1. Use fully qualified name
  val date = new Date
  val sqlDate = new SqlDate(2018,5,4)

  // 2. use aliasing

  //default imports
  // java.lang - String, Object, Exception
  // scala - Int, Nothing, Function
  //scala.Predef - println, ???
}
