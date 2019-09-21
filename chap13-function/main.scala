object Main {
  def main(args: Array[String]): Unit = {
    // Lambda Instance
    val add = new Function2[Int, Int, Int]{
      def apply(x: Int, y: Int): Int = x + y
    }
    println(add.apply(100, 200))
    println(add(100,200))

    // Syntax Suger
    val add2 = (x: Int, y: Int) => x + y
    println(add2(100,200))

    // Direct call
    println(
      new Function2[Int, Int, Int]{ def apply(x: Int, y: Int): Int = x + y }.apply(100, 200)
    )
    println(
      (new Function2[Int, Int, Int]{ def apply(x: Int, y: Int): Int = x + y })(100, 200)
    )
  }
}
