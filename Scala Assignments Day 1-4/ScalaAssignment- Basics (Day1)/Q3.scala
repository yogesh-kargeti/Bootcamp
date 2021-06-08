//A program to count the occurrence of ‘cdc’ in ‘aacdcdcancdcdcdc’ using string function only.

object occurrence {
  def main(args: Array[String]): Unit = {
    val x="aacdcdcancdcdcdc"
    val y="cdc"
    var count=0
    val xle=x.length()
    val yle=y.length()

    for (i <- 0 to (xle-yle))
    {
      if (x.substring(i,i+yle).matches(y)) count+=1
    }
    println("Count: "+count)
  }
}
