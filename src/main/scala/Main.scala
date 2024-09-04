// Main.scala

object Main:
  def main(args: Array[String]): Unit =
    args match
      case Array() => println("Hello, World4!")
      case Array(firstArg) => println(s"Hello, $firstArg!")
