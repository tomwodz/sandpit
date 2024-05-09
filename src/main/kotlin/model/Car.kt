package model

class Car(name: String) : Vehicle(name) {
}

fun main(){
    var car = Car("E38")
    car.brand = "BMW"
    println(car.brand)
}