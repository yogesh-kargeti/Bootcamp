//A tail recursion program for Fibonacci function.

object FibonacciSeries {

  def fibonacci(n: Int): Int = {

    def fibonacci(n: Int, a: Int, b: Int): Int = n match {
      case 0 => a
      case _ => print(a + " "); fibonacci(n-1, b, a+b)
    }

    fibonacci(n, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    val x=12
    println(s"Fibonacci Series upto ${x} terms:")
    fibonacci(x)
  }
  
}
