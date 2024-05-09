package model

class Square (var a: Double){
    fun area(): Double = a * a
}

fun main(){
    var square = Square(5.0)
    println(square.area())
}