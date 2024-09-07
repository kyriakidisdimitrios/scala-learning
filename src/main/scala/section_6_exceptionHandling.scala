import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

import scala.util.Try
import scala.util.Success
import scala.util.Failure

import scala.util.control.Exception.catching

import java.io.FileNotFoundException
@main def main(): Unit = {
    // try{
    //     val f= new FileReader("C:\\HELLO.txt")
    //     val a = 10/0
    //     println(a)
    // }
    // catch{
    //         case e: FileNotFoundException => {
    //             println("File not Found - Exception Received")
    //         }
    //         case e: IOException =>{
    //             println("Error while reading file - Exception Received")
    //         }
    //         case _: Exception => {
    //         println("Error, catch all Exception - Exception Received")
    //     }   
    // }
    // finally{
    //     println("This part is executed all the time");
    // }
    val a = Try (10/5)
    a match{
        case Success(value) => println(value)
        case Failure(value) => println(value)
    }
    val catchExceptions =  catching(classOf[ArithmeticException]).withApply( e=> println("Arithmetic error occured"))

    val ab= catchExceptions(10/0)
    println(ab)
}
