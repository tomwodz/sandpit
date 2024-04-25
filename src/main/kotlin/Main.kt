fun main(args: Array<String>) {
    println("Hello World!")

    //val scannerConsole = ScannerConsole()
    //println(scannerConsole.text)

    var variables = Variables()
    variables.exploreVariables()

    var types = Types()
    types.exploreTypes()

    var a: Double? = 99.999
    var b: Double? = 55.555

    var tmp: Double? = a
    a = b
    b= tmp

    println(a?.toInt())
    println(b?.toInt())

}