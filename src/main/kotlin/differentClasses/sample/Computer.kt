package differentClasses.sample

data class Computer(var procesor: Double, var memory: Int, var drive: Int)

fun main() {
    val computerOne = Computer(5.0, 128, 1024)
    val computerTwo = Computer(4.0, 64, 1024)
    val computerThree = Computer(5.0, 128, 1024)
    println(computerOne == computerTwo)
    println(computerThree == computerOne)
}