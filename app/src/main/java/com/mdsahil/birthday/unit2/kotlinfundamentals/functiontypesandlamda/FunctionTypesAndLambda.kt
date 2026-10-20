package com.mdsahil.birthday.unit2.kotlinfundamentals.functiontypesandlamda

fun main(){



    val treatFunction = trickOrTreat(false,{"$it quarters"})
    val trickFunction = trickOrTreat(true,{"$it quanters"})

    repeat(4){
        treatFunction()
    }
    trickFunction()

}

fun trickOrTreat(isTrick: Boolean,
                 extraTreat: (Int) -> String
): () -> Unit{
    if (isTrick){
        return trick
    }else{
        println(extraTreat(5))
        return treat
    }

}

val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}