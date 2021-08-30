package src.scala.comrtjvm.scala.oop.filesystem

import src.scala.com.rtjvm.scala.oop.commands.Command
import src.scala.com.rtjvm.scala.oop.files.Directory

import java.util.Scanner

object Filesystem extends App{

  val root = Directory.ROOT
  var state = State(root,root)
  val scanner = new Scanner(System.in)

  while(true) {
    state.show
    val input = scanner.nextLine()
    state = Command.from(input).apply(state)
  }

}
