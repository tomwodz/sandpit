class Variables {
    fun exploreVariables() {
        var first: Int
        first = 777
        println(first)

        var number: Int = 888
        println(number)

        var numberNext = 999
        println(numberNext)

        var sum = number + numberNext
        println(sum)

        //convert
        var numberInt: Int = 777
        var numberLong: Long = numberInt.toLong()
        var numberDouble = numberLong.toDouble()

        var mutable: Int = 666
        mutable = 9

        val immutable = 877
        //read only immutable = 666
        //project use val

    }
}