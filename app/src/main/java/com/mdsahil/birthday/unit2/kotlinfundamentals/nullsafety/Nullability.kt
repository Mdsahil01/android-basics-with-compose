package com.mdsahil.birthday.unit2.kotlinfundamentals.nullsafety


fun main() {
    var favoriteActor : String? = "Sandra Oh"

    val lengthOfName = favoriteActor?.length ?:0

    println("The number of characters in your favorite actor's name is $lengthOfName.")

}
/*
var favoriteActor : String? = "Sandra Oh"

if (favoriteActor != null){
    println("The number of character in your favorite actor's name is ${favoriteActor.length}")
}else{
    println("You didn't input a name")
}

 */

/*
?: Elvis operator

!! not null assertion operator
nullable variable !! .method/property

? safety call operator
nullable variable ? .method/property
 */

/*
* var favoriteActor : String? = null

    println(favoriteActor?.length)
*/


/*
//var number : Int? = 10
//
//println(number)
//
//number = null
//println(number)

 */