//Parameterized Constructor (Primary constructor)
//class demoClass(val a:Int, val b:Double, val c:String){
class demoClass(val a:Int = 99, val b:Double =99, val c:String = "aa"){
    val x=a
    val y:Double=b
    val z:String=c

    def addNumber() ={
        x+y
    }

    println(s"Primary Constructorx = ${x} and y = ${y} and z = ${z}") //if i specify the value when creating the object.

    def this() ={
        this(99,88.88, "Hello Scala0")
        println("Auxilary constructor with 0 parameters")
    }
     def this(a:Int) ={
        this(a, 88.88, "Hello Scala1")
        println("Auxilary constructor with 1 parameters")
    }   
     def this(a:Int, b:Double) ={
        this(a, b, "Hello Scala2")
        println("Auxilary constructor with 1 parameters")
    }   
}

@main def main(): Unit = {
    //val demoObject1 = new demoClass(1,7.2,"Hello world")

    //val result:Double = demoObject1.addNumber()
    //println(s"result = ${result}")
    //println(demoObject1.x)

    val demoObject2 = new demoClass(1)
}