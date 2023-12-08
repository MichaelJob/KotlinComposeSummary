import kotlin.random.Random

// Kotlin has no static keyword
// companion object is used for static behavior

class Foo(val bar: Int){

    companion object {
        fun createRandomBar(): Int {
            return Random.nextInt(0, 100)
        }
    }
}

var FooInstance = Foo(bar = 3) //valid

var FooWithRandomBar = Foo.createRandomBar() //valid: invocation is on class Foo


// var invalidFooWithRandomBar = FooInstance.createRandomBar()
// invalid -> compile error ((works in Java with a static method))