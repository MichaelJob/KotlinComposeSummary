//null nullability

val name = "John" //will never be null !
val name: String = "John"  //with type - not mandatory, gets inferred above
name = null //will show compile error
println(name.length) //will always work, because name will never be null - no NullPointerExceptions anymore

//if name shall be able to be null - add a ? behind the type:
val nameOrNull: String? = "John"
nameOrNull = null //now valid
println(nameOrNull.length) //compiler error, as NPE could arise (again)
println(nameOrNull?.length) //null safe call: length of null will also be null, but no NPE from length call!
nameOrNull?.let {  //code in block only executes if nameOrNull not null
    println(it)    // it will value of nameOrNull (not null if this code runs)
}

val greeting: String = nameOrNull ?: "Unknown" //Elvis Operator to assign a default value if variable is null
println(greeting)



