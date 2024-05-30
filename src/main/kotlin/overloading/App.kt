package overloading

fun main(){
    val point1 = Point(1,1)
    val point2 = Point(2,2)
    val sum = point1 + point2
    println("${sum.x} ${sum.y}")

    println(point2 > point1)

    val point3 = Point(5,5)
    val point4 = point3 run point2
}