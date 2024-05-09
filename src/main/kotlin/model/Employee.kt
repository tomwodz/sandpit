package model

open class Employee {
    var name: String? = null
    var salary: Double? = null

    fun info(){
        println("Mam na imię $name, zarabiam $salary")
    }
}

