/*Write a Scala program and use the Tuple type to represent items in a shopping baskets:
"T-Shirt", "Medium", 10.99
"Polo-Shirt", "Large", 4.99
"Vest", "Small", 5.99
"T-Shirt", "Small", 4.99
"T-Shirt", "Small", 4.99
You are free to use whichever data structure is appropriate to store the above-mentioned items. The Scala program should then output all "T-Shirt" items in upper case format. Note that all other items in the shopping basket should then be in the lower case format.
*/


object ques2 {
  def main(args: Array[String]): Unit = {
    var t1=("T-Shirt", "Medium", 10.99)
    var t2=("Polo-Shirt", "Large", 4.99)
    var t3=("Vest", "Small", 5.99)
    var t4=("T-Shirt", "Small", 4.99)
    var t5=("T-Shirt", "Small", 4.99)

    var items=List(t1,t2,t3,t4,t5)
    items.foreach{ it =>
      if (it._1 == "T-Shirt")
        println(s"${it._1.toUpperCase()} is priced at $$${it._3} for the ${it._2} size.")
      else
        println(s"${it._1.toLowerCase()} is priced at $$${it._3} for the ${it._2} size.")
    }
  }
}
