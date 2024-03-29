import java.util.Locale

// Kotlin allows to generate extension functions to objects

// For example to format a number you can define a extension like this:
private val CH = Locale("de", "CH")
private fun Number.format(formatPattern: String) = formatPattern.format(CH, this)
// and use it like this to get one decimal and the unit "cm" to it, as a string
var myNumberVar = 54.321
var formattedString = myNumberVar.format("%,.1f cm")