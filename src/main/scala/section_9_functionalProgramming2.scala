def printIncrementValue(m: => Int)={
    println("Addition value is " + m)
}
def increment() = {
    var y =2
    println("Value of y is " + y)
    var z = y + 1
    println("Value of y after incrementing is " + z)
    z
}
@main def main(): Unit = {
  printIncrementValue(increment())
}
