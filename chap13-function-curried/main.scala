object Main {
  def main(args: Array[String]): Unit = {

    // カリー化は、単に無名関数をネストするだけで実現できる。
    val add_curried = (x: Int) => (
      (y: Int) => x + y
    )

    println(add_curried(100)(200))

    // メソッドに _ を渡すことで、カリー化することもできる。
    // (add は、メソッドであって、関数ではない）
    def add(x: Int)(y: Int): Int = x + y
    val add_curried2 = add _
    println(add_curried2(100)(200))
  }
}
