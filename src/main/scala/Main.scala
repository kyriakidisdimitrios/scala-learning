object Main {
  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      println(s"Hello, ${args(0)}!")
    } else {
      println("Hello, World!")
    }
  }
}
