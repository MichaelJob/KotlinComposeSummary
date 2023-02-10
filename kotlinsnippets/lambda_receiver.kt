// Lambdas with Receivers https://www.baeldung.com/kotlin/lambda-receiver

// function with a parameter "block" of type extension function on StringBuilder
fun printString(block: StringBuilder.() -> Unit) {
    val sb = StringBuilder()
    sb.block() //execute the given parameter
    println(sb.toString())
}

fun main() {
    //call the fun from above with a lambda as a parameter
    printString { 
        append("xyz")    //or: this.append("xyz")
        append(42)
    }
    //prints "xyz42"
}