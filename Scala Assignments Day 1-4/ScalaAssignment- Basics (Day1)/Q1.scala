//A tail recursion program to check whether the number is prime or not.

object primeCheck {
  def isPrime(x:Int) {
    def isPrime(x: Int, t: Int): Unit = {
      if (x == 2) println(x + " is prime")
      else if (x < 2 || x % t == 0) println(x + " is not prime")
      else if (t * t > x) println(x + " is prime")
      else isPrime(x, t + 1)
    }

    isPrime(x,2)
  }

  def main(args: Array[String]): Unit = {
    val num=11
    isPrime(num)
  }
}
