/*Write a program in Scala using Monads flatmap from given two List 
List 1 = (1 to 3).toList
List2 = (1 to 7 by 2).toList  */

object monads {
  def main(args: Array[String]): Unit = {
    val List1 = (1 to 3).toList
    val List2 = (1 to 7 by 2).toList
    val newList = List1 flatMap { x => List2 map {
      y => x*y
    } }
    println(newList)
  }
}
