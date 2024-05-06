import java.nio.DoubleBuffer

fun main(){
    var sum = add(5.0,8.0)
    println(sum)
    printStr(sum)
    var sum2 = addWithName(a = 10.0, b = 7.0)
    println(sum2)
    sum2 = addWithName(b = 7.0, a = 10.0)
    println(sum2)
    printStr(str = 77.0)
    println(addWithDefaultValue())
    println(addWithDefaultValue(4.0,4.0))
    println(addWithDefaultValue(b = 12.0))
    printMyFun(6)
    printMyFun()
    println(addShort(6.0,77.0))
    printShort("tekst tekst tekst")
    println(short18(19))
    println(nextEven(9))
    println(nextEven(10))
    println(accessibleYear(2010))
    numbers(1,10)
}

fun add(a: Double, b: Double): Double {
    return a + b
}

//void
fun printStr(str: Double): Unit {
    println(str)
}

fun addWithName(a: Double, b:Double): Double {
    return a + b
}

fun addWithDefaultValue(a: Double = 8.0, b: Double = 5.0): Double {
    return a + b
}

fun printMyFun(n: Int = 7){
    for(i in 1 .. n){
        for(j in 1 ..i){
            print("*")
        }
        println()
    }
}

fun addShort(a: Double, b:Double) = a + b

fun printShort(str: String) = println(str.uppercase())

fun short18(age: Int): Boolean = if (age > 18) true else false

fun nextEven(n: Int): Int = if (n % 2 == 0) n + 2 else n + 1

fun accessibleYear(year: Int): Boolean = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)

fun numbers(a: Int, b: Int) {
    for (i in a .. b) {
        println("$i")
    }
}