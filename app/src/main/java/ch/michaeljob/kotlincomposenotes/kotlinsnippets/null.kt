//null nullability
fun MyNullability(){
    val name1 = "John" //will never be null !
    val name2: String = "John"  //with type - not mandatory, gets inferred above
    // name1 = null //will show compile error
    println(name1.length) //will always work, because name will never be null - no NullPointerExceptions anymore

    //if name shall be able to be null - add a ? behind the type:
    var nameOrNull: String? = "John"
    nameOrNull = null //now valid
    //println(nameOrNull.length) //compile error, as NPE could arise (again)
    println(nameOrNull?.length) //null safe call: length of null will also be null, but no NPE from length call!
    nameOrNull?.let {  //code in block only executes if nameOrNull not null
        println(it.toString())    // "it" will be value of nameOrNull; toString needed for println()
    }

    //Elvis Operator ?: to assign a default value if variable is null
    val greeting: String = nameOrNull ?: "name unknown"
    println(greeting)

}