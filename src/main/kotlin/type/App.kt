package type

fun main() {
    val vehicle: Vehicle
    val car = Car()
    check(car)
    val motor = Motor()
    check(motor)
    println("----------------------")
    checkAny(car)
    checkAny(motor)
    checkAny("Text")
    checkAny(1.0)

    projectors(5)
    projectors(5.0)
    projectors(null)
    projectors("Text")
}

fun check(vehicle: Vehicle) {
    if (vehicle is Car) {
        vehicle.run()
    } else {
        println("Only run Car")
    }
}

fun checkAny(a: Any) {
//    if(a is Vehicle){
//        a.run()
//    } else if(a is String){
//        println(a.uppercase())
//    } else {
//        println("What is this?")
//    }
    when (a) {
        is Vehicle -> a.run()
        is String -> println(a.uppercase())
        else -> println("What is this?")
    }
}

fun projectors(a: Any?) {
        var number: Int? = a as? Int
        println(number)
}