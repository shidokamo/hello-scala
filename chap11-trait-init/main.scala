trait TraitA {
  val foo: String
}

trait TraitB extends TraitA {
  val bar = foo + " World"
}

class ClassC extends TraitB {
  val foo = "Hello"
  def print(): Unit = println(bar)
}

trait TraitBwithLazy extends TraitA {
  lazy val bar = foo + " World"
}

class ClassCwithLazy extends TraitBwithLazy {
  val foo = "Hello"
  def print(): Unit = println(bar)
}

object Main {
  def main(args: Array[String]): Unit = {
    val c = new ClassC
    c.print()
    val c_lazy = new ClassCwithLazy
    c_lazy.print()
  }
}
