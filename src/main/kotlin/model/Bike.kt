package model

class Bike (var brand: String? = null){
    var model: String? = null
        get() {
            return "$brand - X12"
        }
        private set

    var modelNext: String? = null
        get() =  "$brand - X13"

    var price: Double = 900.0
        set(value){
            field += value
        }
}

fun main(){
    var bike = Bike("Kross")
    println(bike.brand)
    bike.brand = "Romet"
    println(bike.brand)
    println(bike.model)
    println(bike.modelNext)
    println(bike.price)
    bike.price = 1000.00
    println(bike.price)
}