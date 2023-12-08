/*
 * Strings can be easily combined like so
 */
fun StringConcatenations(){
    var anyValue = "WAT"
    var myString = "$anyValue-MAN"   //WAT-MAN

    var anyObject = MyObject(title = "myObject1")
    var myString2 = "The title of this is ${anyObject.title} - okay?"   //The title of this is myObject1 - okay?
}


data class MyObject(val title: String)