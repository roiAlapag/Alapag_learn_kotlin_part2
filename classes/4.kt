class Employee(val firstName: String, val lastName: String, val yearsWorked: Int) {
  // Write your code below 
  var fullName = "$firstName $lastName"

  init {
    if (yearsWorked > 1) {
      println("$fullName is eligible for a raise!")
    } else {
      println("$fullName is not eligible for a raise just yet.")
    }
  }


} 

fun main() {
  // Create an instance below 👩🏻‍💼
  var projectManager = Employee("Maria", "Gonzalez", 2)
}