//Create a Vector with the following numeric items: 0, 10, 20, 47, -2, 99, -98. Write a Scala program to find the smallest and the largest numeric item in the Vector.

object ques4 {
  def main(args: Array[String]): Unit = {
    var vec: Vector[Int]= Vector(0, 10, 20, 47, -2, 99, -98)
    var max: Int= vec(0)
    var min: Int= vec(0)
    vec.foreach{ x=>
    if (x>max)  max=x
    if (x<min)  min=x
  }
    println(s"Max in Vector= $max")
    println(s"Min in Vector= $min")
    /*   println(s"Max in Vector= ${vec.max}")
         println(s"Min in Vector= ${vec.min}")
    */
  }
}
