//Using implicit Classes, Create class called money exchange and create function for dollar, euro, Dinar exchanges using implicit class

object moneyExchange {
  def main(args: Array[String]): Unit = {
    println(s"Rs. 6000 in dollar = ${6000.dollarEx}")
    println(s"Rs. 6000 in euro = ${6000.euroEx}")
    println(s"Rs. 6000 in dinar = ${6000.dinarEx}")

  }
  implicit class moneyExchange(x: Int){
    def dollarEx: Double = x/72.36
    def euroEx: Double = x/86.37
    def dinarEx: Double = x/239.60
  }

}
