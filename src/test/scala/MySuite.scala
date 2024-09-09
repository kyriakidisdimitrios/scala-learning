// test/scala/MySuite.scala
import munit.FunSuite

class MySuite extends FunSuite {
  
  // A test for the increment function
  test("increment should return 3 when y starts at 2") {
    val result = increment()  // Call the function from main/scala
    assertEquals(result, 3)   // Check that result equals 3
    
  }
}