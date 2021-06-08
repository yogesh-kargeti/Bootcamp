//A program to find out whether the string is alphanumeric or pure_String .

object count {
  def main(args: Array[String]): Unit = {
    val s="To The New"
    if (s.matches("[a-zA-Z\\s]*"))
      print("Pure_string")
    else
      print("Alphanumeric")
  }
}
