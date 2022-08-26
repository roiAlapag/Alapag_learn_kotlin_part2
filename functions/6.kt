fun main() {
  // Write your code below
  
  // anonymous function 
  var area = fun(base: Int, height: Int): Int {
    return (base * height) / 2
  }
  println(area(15, 19))

  // lambda expression
  var perimeter = { side1: Int, side2: Int-> (side1 + side2) * 2}

  println(perimeter(15, 24))

}