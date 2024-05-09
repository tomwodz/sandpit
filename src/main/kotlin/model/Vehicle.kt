package model

//private class Vehicle {
//internal class Vehicle {
open class Vehicle public constructor(private var name: String) {
    public var brand: String? = null
    protected var power: Double? = null
    private var equipment: String? = null
    var length: Double? = null
    internal var width: Double? = null
}

fun main(){
    var vehicle = Vehicle("BMW")
    vehicle.brand
    vehicle.width
    vehicle.length
}