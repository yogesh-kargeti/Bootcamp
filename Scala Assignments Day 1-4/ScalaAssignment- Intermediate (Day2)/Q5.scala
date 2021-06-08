//Create Class Teacher with method does and subclass ArtTeacher & PhyiscTeacher extends Teacher class and override the teacher does method with Primanry & auxiliary constructors

class Teacher(Name: String) {
  def does(): Unit = {
    println(s"${Name} teaches in the school.")
  }
}
class ArtTeacher(Name: String, Class: Int) extends Teacher(Name){
  def this(Name:String){
    this(Name,9)
  }

  override def does(): Unit = {
    println(s"${Name} teaches Art to class ${Class}")
  }
}
class PhysicsTeacher(Name: String, Class: Int) extends Teacher(Name){
  def this(Name:String){
    this(Name,11)
  }

  override def does(): Unit = {
    println(s"${Name} teaches Physics to class ${Class}")
  }
}
object test_teacher{
  def main(args: Array[String]): Unit = {
    var ob1= new Teacher("Deepika")
    ob1.does()
    var ob2=new ArtTeacher("Rahul",10)
    ob2.does()
    var ob3=new PhysicsTeacher("Ravi")
    ob3.does()
  }
}
