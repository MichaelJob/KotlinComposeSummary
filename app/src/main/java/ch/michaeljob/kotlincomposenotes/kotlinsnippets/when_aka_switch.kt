/*
 * Switch statements are done by the keyword "when"
 */
fun mySwitchCases(){

    val state = ""
    when (state) {
        "aargau" -> print("Hoi!")
        "zürich" -> print("Hey, tschau!")
        else -> {
            print("Grüezi")
        }
    }

    // use with various (boolean) conditions
    val isSunny = true

    val whenWithoutParameter = when {
        state == "aargau" -> {} //do AG stuff
        isSunny -> {} //do sunny stuff
        else -> {} //necessary else branch if undefined all cases covered
    }

    val numericValue = when (Bit.ONE) {
        Bit.ZERO -> 0
        Bit.ONE -> 1
        // 'else' is not required because all cases are covered
    }
}

enum class Bit {
    ZERO, ONE
}