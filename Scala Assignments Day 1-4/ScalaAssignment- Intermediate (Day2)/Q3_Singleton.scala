//Create a singleton object

object singleton {
  def display(name: String): Unit = {
    print(s"Hello ${name}! This is Scala Program")
  }
}
object testIt {
  def main(args: Array[String]): Unit = {
    singleton.display("Deepak")
  }
}
