package src.scala.com.rtjvm.scala.oop.commands

import src.scala.comrtjvm.scala.oop.filesystem.State

trait Command {
  def apply(state:State) : State
}
object Command{
  val MKDIR = "mkdir"

  def emptyCommand: Command = new Command {
    override def apply(state:State): State = state
  }

  def incompleteCommand(name:String): Command = new Command{
    override def apply(state: State): State =
      state.setMessage(name + "Incomplete command")
  }
  def from(input: String): Command = {
    val tokens: Array[String] = input.split(" ")

    if(input.isEmpty || tokens.isEmpty) emptyCommand
    else if("mkdir".equals(tokens(0))){
      if(tokens.length < 2) incompleteCommand("mkdir")
      else new Mkdir(tokens(1))
    } else new UnknownCommand
  }
}
