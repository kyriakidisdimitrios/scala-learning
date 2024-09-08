// trait Car:
//     def engine(): Unit = {
//         println("Engine is 1000 CC")
//     }
//     def break(): Unit
//     def tyres(): Unit

// class Mercedez extends Car{
    
//     def break(): Unit = {
//         println("Break")
//     }
//     def tyres(): Unit = {
//         println("Tyres")
//     }
// }
// class Mini extends Mercedez{
//     override def engine(): Unit = super.tyres() 
// }

// @main def main(): Unit = {
//     val benz =  new Mercedez();
//     benz.break();
// }