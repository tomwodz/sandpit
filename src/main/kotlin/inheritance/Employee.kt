package inheritance

open class Employee(
    var name: String,
    var salary: Double
) {

    open var age: Int = 18
    open fun info() {
        println("Mam na imię $name, zarabiam $salary")
    }
}