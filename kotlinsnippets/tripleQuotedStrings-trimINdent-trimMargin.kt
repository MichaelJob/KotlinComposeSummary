const val question = "life, the universe, and everything"
const val answer = 42

val tripleQuotedString = """
    #question = "$question"
    #answer = $answer
    """

val tripleQuotedStringTrimIndent = """
    #question = "$question"
    #answer = $answer
    """.trimIndent()

val tripleQuotedStringTrimMargin = """
    #question = "$question"
    #answer = $answer
    """.trimMargin("#")

fun main() {
    println("tripleQuotedOnly")
    println(tripleQuotedString)
    println("trimIndent")
    println(tripleQuotedStringTrimIndent)
    println("trimMargin")
    println(tripleQuotedStringTrimMargin)
}

/*
tripleQuotedOnly

#question = "life, the universe, and everything"
#answer = 42

trimIndent
#question = "life, the universe, and everything"
#answer = 42
trimMargin
question = "life, the universe, and everything"
answer = 42
*/