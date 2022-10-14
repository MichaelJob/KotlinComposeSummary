data class Product(val name: String, val price: Double) {
    override fun toString() = "'$name' for $price"
}

// define a data class with only the keyword "data" before class
// the provided parameters with var or val are properties, with getters and setters behind the scenes by kotlin
// equals, hashcode, and toString are magically there as well and can be overwritten if needed