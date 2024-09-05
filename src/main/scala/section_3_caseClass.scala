case class Car(var name: String, model: String) { //by default name, String are val 
  var carName = name
  var carModel = model

  def printDetails(): Unit = {
    println(s"Car name is: ${carName} and car model is: ${carModel}")
  }
}
@main def main(): Unit = {
    //val bmw = new Car("BMW", "550")
    val bmw = Car("BMW", "550") //1. No need to write new, since apply method is auto generated in case class
    bmw.printDetails()
    bmw.name = "B.M.W" //2. constructor parameter is valk by default, therefore mutator method is 
    bmw.printDetails()

    bmw match{ case Car(a,b) => println(a+" "+b)} //3. There is unapply method, used for matching
    
    val mercendez = bmw.copy(name = "mercendez")//4. Autogenerates copy mathod
    mercendez.printDetails()
    
    //5. equals the hashcode method
    println(bmw==mercendez)

    //6, toString is auto implemented
    println(bmw)


} 