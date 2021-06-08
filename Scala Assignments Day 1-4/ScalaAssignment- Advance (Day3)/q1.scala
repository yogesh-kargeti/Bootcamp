/*
Assume the following lexical coupon codes: "A", "BB", "CCC", "DDDD", "EEEEE".
Write a Scala program to create a new set of coupon codes based on the above one.
The format for each coupon code should be as follows: "coupon code - i",
where the number i is derived from the length of each corresponding coupon code. */

object q1 {
  def main(args: Array[String]): Unit = {
    var lexCouponCodes = List("A","BB","CCC","DDDD","EEEEE")
    var changeCouponCOdes = lexCouponCodes.map(x => s"${x}-${x.length}")
    changeCouponCOdes.foreach(println(_))
  }

}
