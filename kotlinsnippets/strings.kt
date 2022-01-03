/*
 * Strings can be easily combined like so
 */
var anyValue = "WAT"
var myString = "$anyValue-MAN"   //WAT-MAN

var anyObject = MyObject(title = "myObject1")
var myString2 = "The title of this is ${anyObject.title} - okay?"   //The title of this is myObject1 - okay?
