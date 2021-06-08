//Using implicit parameter, Create a method to calEggNo  in crate.  1 crate = 30 eggs.

object crate {
  def main(args: Array[String]): Unit = {
    implicit var eggs: Int =30;
    implicit var eggs2: String ="yes";
    var crates: Int=5;
    //Calling Without parameters
    calEggNo(crates)
    //Calling with parameters
    calEggNo(crates)(10)

    def calEggNo(ct: Int)(implicit no: Int): Unit ={
      println(s"No of Eggs in ${ct} crates each having ${no} eggs: ${no*ct} eggs")
    }
  }
}
