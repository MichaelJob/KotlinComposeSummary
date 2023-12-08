// basic kotlin class
class Foobar(val name: String, val id: Int)

// class that can be inherited from
open class Car(val name: String, val id: Int)

class VipCar(name: String, id: Int): Car(name, id) {
    var starRating = 0  //variable only in VipCar
}


// class that can be inherited from, but on compile time every child class is known (there will be no further children)
sealed class Boat(val name: String, val id: Int)

class VipBoat(name: String, id: Int): Car(name, id) {
    var starRating = 0  //variable only in VipCar
}