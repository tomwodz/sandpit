package extension

fun main(){
    val car = Car()
    car.run()
    car.stop()
    val info = "Car"
    println(info.removeFirstLetter())
}

fun Car.stop() {
    println("Car stop")
}

fun String.removeFirstLetter(): String {
    return this.substring(1)
}