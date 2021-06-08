//Create a companion class and object

class companionClass {
  private var x: Int=5
  var y:Int=6
}
object companionClass{
  def main(args: Array[String]): Unit = {
    var ob=new companionClass()
    println("Value of X: "+ob.x)
    println("Value of Y: "+ob.y)
  }
}
