object Main {
  def main(args: Array[String]): Unit = {
    val p1 = new Point3D(1, 2, 3)
    val p2 = new Point3D(3, 2, 1)
    println(p1 + p2)
    val adder = p1.add(2, _)
    println(adder)
    println(adder(4))
  }
}
