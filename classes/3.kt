// Write your class below 
class Person (val name: String, val age: Int, val favoriteColor: String)


fun main() {
  // Create your instances below 
  val me = Person("Roi", 22, "Pink")
  val myFriend = Person("Ku", 21, "Green")

  println("${me.name} is ${me.age} years old and my favorite color is ${me.favoriteColor}")

   println("${myFriend.name} is ${myFriend.age} years old and his favorite color is ${myFriend.favoriteColor}")
}