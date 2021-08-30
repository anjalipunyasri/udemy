package src.scala.com.rtjvm.scala.oop.commands

import src.scala.com.rtjvm.scala.oop.files.{DirEntry, Directory}
import src.scala.comrtjvm.scala.oop.filesystem.State

class Mkdir(name:String) extends Command{

  override def apply(state:State):State = {
    val wd = state.wd
    if(wd.hasEntry(name)){
      state.setMessage("Entry" + name + "already exists!")
    } else if (name.contains(Directory.SEPARATOR)) {
      state.setMessage(name + " must not contain separators!")
    } else if(checkIllegal(name)){
        state.setMessage(name + ": illegal entry name!")
    } else {
      doMkdir(state,name)
    }
  }

  def checkIllegal(name:String): Boolean = {
    name.contains(".")
  }
  def doMkdir(state:State,name:String): State = {
    def updatedStructure(currentDirectory: Directory,path:List[String],newEntry: DirEntry):Directory = ???
     // if(path.isEmpty) currentDirectory.addEntry(newEntry)
      //else {
        /* currentDirectory = /a
        path = ["b"]
         */
        //
        //
     // }
      /*
      /a/b
        /c
        /d
        (new) /e
      new /a
       new /b (parent /a)
        /c
        /d
        /e
      */


    val wd = state.wd

    // 1. all the directories in the full path
    val allDirsInPath = wd.getAllFoldersInPath

    // 2. create new directory entry in the wd
    val newDir = Directory.empty(wd.path, name)

    //3. update the whole directory structure starting from the root
    //(the directory structure is INSTANCE)
    val newRoot = updatedStructure(state.root,allDirsInPath, newDir)

    //4. find new working directory INSTANCE given wd's full path, in the NEW directory structure
    val newWd = newRoot.findDescendant(allDirsInPath)

    State(newRoot, newWd)
  }


}
