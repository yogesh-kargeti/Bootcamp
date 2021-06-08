//Create a Animal case class with alteast 5 fields set & get the values of Animal

case class animal (Name: String, NoOfLegs: Int, Sound: String, Habitat: String, FoodHabit: String)
object caseClassTest {
  def main(args: Array[String]): Unit = {
    var obj=new animal("Dog",4,"Bark","Land","Omnivores")
    println("Name: "+obj.Name)
    println("NoOfLegs: "+obj.NoOfLegs)
    println("Sound Type: "+obj.Sound)
    println("Habitat Type: "+obj.Habitat)
    println("Food Habit Type: "+obj.FoodHabit)
  }
}
