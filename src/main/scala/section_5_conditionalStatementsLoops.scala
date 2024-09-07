
// import scala.util.control.Breaks


// @main def main(): Unit = {
//     //int x= 1;
//     // for(i<-1 to 10){
//     //     println("value of i is " + i)
//     // }
//     //     for(i<-1 until 10){
//     //     println("value of i is " + i)
//     // }

//     // for (i<- 1 to 10;j<- 1 to 10){
//     //     println("Value of i is " + i + ". Value of j is " + j + ".")
//     // }
//     var numberList = List(1,2,3,4,5,6,7,8,9,10)

//     // for(i<- numberList){
//     //     println(i)
//     // }
//     // for(i<-numberList if i%2 == 0; if i!=4){
//     //    println(i)
//     // }

//     var evenNumberList = for (i<-numberList if i%2 == 0) yield i
//     println(evenNumberList)

//     val breakObject = new Breaks;
//     breakObject.breakable{
//         for(i<-numberList if i%2!=0){
//             println(i)
//             if(i==5){
//                 println("i is breaking in 5")
//                 breakObject.break();
//             }
//         }

//     }
// }
