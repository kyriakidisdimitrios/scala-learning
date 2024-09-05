import scala.util.matching.Regex


case class Car(var name: String, model: Int) { 
  var carName = name
  var carModel = model

  def printDetails(): Unit = {
    println(s"Car name is: ${carName} and car model is: ${carModel}")
  }
}

@main def main(): Unit = {
    var greetings = "Hello World"
    println(greetings)
    var greetingsNew:String = "Hello world"
    println(greetingsNew)

    var lengthOfString = greetings.length() //Accessor- Any method - Anby method (e.g. length) used to get information about the object
    println(lengthOfString)

    def matchPattern(x:Any)= x match {
         case 1=> "One"
         case 2=> "Two"
         case 3=> "Three"
         case 4=> "Four"
         case _=> "None of the above"
    }

    
    println(matchPattern(4))
    val mercedes = new Car("Mercedes", 50000)
    val bmw = new Car("BMW", 70000)
    val jaguar = new Car("Jaguar", 100000)

    for (car<-List(mercedes, bmw, jaguar)){
        car match{
            case Car("Mercedes",50000) => println("Car is Mercedes")
            case Car("BMW",70000) => println("Car is BMW")
            case Car(name, cost) => println("Car is" + name + " Cost is " + cost)
        }
    }

    val pattern = new Regex("Hello")
    val stringToFind = "Hello how are you? Hello Again"
    pattern findFirstIn stringToFind
    (pattern findFirstIn stringToFind).mkString(",")
    val pattern1 = "Hello".r
    (pattern findAllIn stringToFind).mkString(",") 

    var stringToFind1 = "My name is Dimittios and age is 10 and I study in standard 7"
    val pattern2="[0-9]+".r

    (pattern findAllIn stringToFind).mkString(",")
    (pattern findAllIn stringToFind).toArray

    val stringToFind3 = "Hello how are you? Hello Again"

    val pattern3 = "(H|h)ello".r
    (pattern3 findAllIn stringToFind).toArray

    implicit class stringFinClass(s:String){
      def firstChar = s.substring(0,1)
      def nthChar(n:Int) = s.substring(n,n+1)
    }
      println("Hello".firstChar)

}