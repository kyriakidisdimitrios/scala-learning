// @main def main(): Unit = {
//     var marks = Array(58,36,18,56,45,95)


//     var totalMarks = 0 
//     var averageMarks =0
//     for (mark<-marks){
//         totalMarks = totalMarks + mark
//     }
//     averageMarks = totalMarks / marks.length

//     println("Average Marks is " + averageMarks)
    
//     //map and foreach
//      marks.foreach(println)

//      totalMarks = 0 
//      marks.foreach(mark=>totalMarks = totalMarks+mark)
//      averageMarks = totalMarks /marks.length
//      println("Average Marks is " + averageMarks)

//      marks.foreach(totalMarks+_)

//      //var newMark = marks.map(mark=> mark +10)
//      var newMark = marks.map(_ +10)

//      newMark.foreach(println)

//      //map quicker

//      // for + yield to give 1 result
//      val result = for(mark <-marks) yield {mark +10}
     

// }