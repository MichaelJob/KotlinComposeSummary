// Kotlin has no static keyword

// companion object is used for static behavior

class Foo(val bar: Int){

    companion object {
        fun createRandomBar(): Int {
            return Random.nextInt(0, 100)
        }
    }
}

var anyBar = Foo.createRandomBar() //valid invocation is on class

var anyFooInstance = Foo(3)
var anyBar = anyFooInstance.createRandomBar() // invalid -> compile error ((works in Java with a static method))
