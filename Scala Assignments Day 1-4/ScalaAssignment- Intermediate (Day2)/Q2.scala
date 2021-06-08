//Create Class call Car with parameter as Name, Type, Brand, Launchyear with method display to print it info with apply function


class cars(Name: String, Type: String, Brand: String, LaunchYear: Int ) {
 def display(): Unit ={
   println("Name :"+Name)
   println("Type: "+Type)
   println("Brand: "+Brand)
   println("LaunchYear: "+LaunchYear)
 }
  def apply(na: String)={
    println(s"Hello ${na}! Great you're purchasing ${Name}.")
  }

}
object test {
  def main(args: Array[String]): Unit = {
    var obc=new cars("Swift","Sedan","Suzuki",2008)
    obc.display()
    obc("Yogesh")
  }
}
