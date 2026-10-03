package com.mdsahil.birthday.unit2.kotlinfundamentals.conditonals

fun main() {
    val trafficLightColor = "Amber"

    val message = when(trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }
    println(message)
}






//fun main() {
// val trafficLightColor = "Amber"
//
// when (trafficLightColor) {
//  "Red" -> println("Stop")
//  "Yellow", "Amber" -> println("Slow")
//  "Green" -> println("Go")
//  else -> println("Invalid traffic-light color")
// }
//}



//Method-2
//fun main(){
// val x: Any = 20
//
// when (x) {
//
//  2,3,5,7 -> println("x is a prime number between 1 and 10.")
//  in 1..10 -> println("x is a prime number between 1 and 10.")
//  is Int -> println("x is an integer number, but not between 1 and 10.")
//  else -> println("x isn't a prime number between 1 and 10.")
// }
//
//}

/*
Method 1
fun main(){
   val x = 5

   when(x){
       2 ,3,5,7-> println("x is a prime number between 1 and 10.")
       else -> println("x isn't a prime number between 1 and 10.")
   }
*/













//    val trafficLightColor = "Yellow"
//
//    when (trafficLightColor){
//        "Red" -> println("Stop")
//        "Yellow" -> println("Slow")
//        "Green" -> println("Go")
//        else -> println("Invalid traffic-light color")
//
//    }



