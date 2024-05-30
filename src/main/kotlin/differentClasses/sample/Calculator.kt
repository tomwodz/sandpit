package differentClasses.sample

object Calculator {
    fun add(a: Double, b: Double): Double = a + b
    fun subtraction(a: Double, b: Double): Double = a - b

}

fun main() {
    var a = 9.0
    var b = 11.0
    var result = Calculator.add(a, b)
    println("$a + $b = $result")
    result = Calculator.subtraction(a, b)
    println("$a - $b = $result")
}