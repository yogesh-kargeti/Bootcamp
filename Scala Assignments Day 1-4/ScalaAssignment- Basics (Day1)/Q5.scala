//Program to identify real time use cases where we can use Call-by-Value and Call-by-Name function parameters.Implement the same in the ////program.

object callTypes {
  def main(args: Array[String]): Unit = {
    def cal(): Int = {
      println("Computing")
      4
    }
    def cbv(t: Int) = {
      println("by value 1: "+t)
      println("by value 2: "+t)
    }
    def cbn(t: => Int) = {
      println("by name 1: "+t)
      println("by name 2: "+t)
    }

    cbv(cal())
    cbn(cal())
  }
}
