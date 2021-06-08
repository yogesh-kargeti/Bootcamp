//Write a Scala program to print Fibonacci series till n numbers using for comprehension method

object ques5 {
  def main(args: Array[String]): Unit = {
      var n :Int = 15
      var (a,b)=(0,1)
      var c: Int=0
      print(s"${a} ${b}")
      for(i <- 0 until n-2){
        c=a+b
        print(s" ${c}")
        a=b
        b=c
      }
  }
}
