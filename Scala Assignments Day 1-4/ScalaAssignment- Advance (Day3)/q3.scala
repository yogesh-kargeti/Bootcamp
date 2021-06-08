//Write a Scala program and create two Lists data structures as follows: (1) The first List will have items named "pencil", "pen", "sharpener", and (2) The second List will have items name "math book", "french book", "english book". Merge the two List data structures such that the resulting combined data structure is of type List[List[String]]. Finally, output all items with the literal " is required in the classroom.".

object ques3 {
  def main(args: Array[String]): Unit = {
    var l1=List("pencil", "pen", "sharpener")
    var l2=List("math book", "french book", "english book")
    var l3=List(l1,l2)
    l3.foreach { x => {
      x.foreach{ y =>
        println(s"$y is required in the classroom.")
      }
    }

    }
  }
}
