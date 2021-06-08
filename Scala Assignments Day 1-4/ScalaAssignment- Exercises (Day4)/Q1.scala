//Using Pattern matching, write a function to swap that receive two integers number and swap the integers 

object swap {
  def swap(x: (Int, Int)): (Int,Int)= x match {
    case (f,s) => (s,f)
  }
  def main(args: Array[String]): Unit = {
  println(swap(25,68))
  }
}
