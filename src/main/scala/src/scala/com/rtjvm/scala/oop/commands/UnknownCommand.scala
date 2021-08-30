package src.scala.com.rtjvm.scala.oop.commands

import src.scala.comrtjvm.scala.oop.filesystem.State

class UnknownCommand extends Command {

  override def apply(state: State): State =
    state.setMessage("Command not found")
}
