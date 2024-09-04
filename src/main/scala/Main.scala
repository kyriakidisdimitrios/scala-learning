object HelloWorld:

  def main(args: Array[String]): Unit =
    println("Hello World2!")
    // Uncomment these lines as needed to test different functions
    // val result = add(2, 5)
    // println(s"Addition of 2 and 5 is: $result")

    // val result = addA(2, 5)
    // println(s"Addition of 2 and 5 is: $result")

    // val result = addB(2, 5)
    // println(s"Addition of 2 and 5 is: $result")

    val result = addD(2, 5)
    println(s"Addition of 2 and 512 is: $result")

  def add(x: Int, y: Int): Int =
    val z = x + y
    z

  def addA(x: Int, y: Int): Int =
    val z = x + y
    z  // No need for the return keyword

  def addB(x: Int, y: Int): Int =
    val z = x + y
    z  // No need for the return keyword

  def addC(x: Int, y: Int): Int =
    val z = x + y
    z  // No need for the return keyword

  def addD(x: Int, y: Int): Int = x + y
