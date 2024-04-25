import kotlin.concurrent.fixedRateTimer

fun main() {

    var first = 7
    var second = 7

    var result: Boolean

    result = first == second
    println(result)

    result = first != second
    println(result)

    result = first < second
    println(result)

    result = first <= second
    println(result)

    result = first > second
    println(result)

    result =  second >= second
    println(result)

    result = 7 in first..second
    println(result)

    result =  6 !in first..second
    println(result)

    var source = first + second
    println(source)

    source = first.plus(second)
    println(source)

    source = first.times(second)
    // *
    println(source)

    source = first.div(second)
    // %
    println(source)

    var sum = 70
    sum++
    sum--

    println(16 <= sum && sum <= 90)

    println(sum in 16..90)
    println(sum in 70..80)

    println(sum <= 16 || 90 <= sum)

    println(sum <= 16 || 50 <= sum)

    var apple = true
    println(!apple)

    var orange = true

    var juice = apple && orange
    println(juice)

    juice = apple and orange
    println(juice)

    juice = apple || orange
    println(juice)

    juice = apple or orange
    println(juice)

}