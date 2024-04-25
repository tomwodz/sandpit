fun main() {
    var numbers: IntArray = IntArray(4)
    numbers[0] = 1
    numbers[1] = 10
    numbers[2] = 99
    numbers[3] = 777

    println(numbers[2])

    var numbersBig = intArrayOf(1000, 2000, 3000, 10, 99)
    println(numbersBig.size)

    numbersBig.set(4, 1000)
    println(numbersBig.get(4))

    println(numbersBig.lastIndex)
    println(numbersBig.get(numbersBig.lastIndex))

    //!!
    var juice: Array<String> = arrayOf("orange", "apple")
    println(juice.get(0))
    println(juice.get(1))

    var twoDimensional = arrayOf(
        intArrayOf(77, 88),
        intArrayOf(99, 100),
        intArrayOf(22, 444)
    )
    println(twoDimensional[0][0])
    println(twoDimensional[2][1])
}