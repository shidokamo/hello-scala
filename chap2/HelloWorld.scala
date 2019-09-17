object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World!")

    val u = new User("dwango", 13)
    User.printUser(u)
  }
}
