class Cell[A](var value: A) {
  def put(newValue: A): Unit = {
    value = newValue
  }
  def get(): A = value
}

object Main {
  def main(args: Array[String]): Unit = {
    val cell = new Cell[Int](1)
    println(cell.get())
    cell.put(2)
    println(cell.get())
    // cell.put("string") // will cause compilation error
    val cell2 = new Cell[String]("Hello")
    println(cell2.get())
    cell2.put("World")
    println(cell2.get())
  }
}
