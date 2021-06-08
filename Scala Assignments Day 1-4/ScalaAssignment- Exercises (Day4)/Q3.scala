//Using implicit functions, Create a function called is Overweight which tells whether a person is overweight or not. Any person whose weight more than 72 

object weight {
  def main(args: Array[String]): Unit = {
    implicit def asInt(x: String) : Int = augmentString(x).toInt
    def disp(t: Int): Unit = {
      if (t>72)
        print("Overweight")
      else
        print("Not overweight")
    }
    disp("79")
  }
}
