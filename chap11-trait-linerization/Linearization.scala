trait TraitA {
  def greet(): Unit
}

trait TraitB extends TraitA {
  override def greet(): Unit = println("TraitB")
}

trait TraitC extends TraitA {
  override def greet(): Unit = println("TraitC")
}

class ExtendsBwithC extends TraitB with TraitC
class ExtendsCwithB extends TraitC with TraitB

object Main {
  def main(args: Array[String]): Unit = {
    val bc = new ExtendsBwithC
    bc.greet()
    val cb = new ExtendsCwithB
    cb.greet()
  }
}
