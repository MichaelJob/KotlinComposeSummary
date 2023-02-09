/*
 * Switch statements are done by the keyword "when"
 */
val state = ""
when (state) {
    "aargau" -> print("Hoi!")
    "zürich" -> print("Hey, tschau!")
    else -> { 
        print("Grüezi")
    }
}


// use with various (boolean) conditions
val isItSunny = true

val whenWithoutParameter = when {
    state == "aargau" -> {} //do AG stuff
    isItSunny -> {} //do sunny stuff
    else -> {} //necessary else branch if undefined all cases covered
}



enum class Bit {
    ZERO, ONE
}

val numericValue = when (getRandomBit()) {
    Bit.ZERO -> 0
    Bit.ONE -> 1
    // 'else' is not required because all cases are covered
}