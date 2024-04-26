fun main(){

    var number = 700

    if(number > 0){
        println("Liczba dodatnia")
    }

    if(number > 0){
        println("Liczba dodatnia")
    } else if (number < 0) {
        println("Liczba ujemna")
    } else {
        println("Liczba jest 0")
    }

    var evenNumber: Boolean

    if(number % 2 == 0){
        evenNumber = true
    } else {
        evenNumber = false
    }

    println(evenNumber)

    if(number % 2 == 0) evenNumber = true else evenNumber = false
    println(evenNumber)

    evenNumber = if(number % 2 == 0) {
        println("Liczba parzysta")
        true
    } else {
        println("Liczba nieparzysta")
        false
    }
    println(evenNumber)

    evenNumber = if(number % 2 == 0) true else false
    println(evenNumber)

    var numberWhen = 3

    when (numberWhen){
        0 -> println("O")
        1 -> println("1")
        2 -> println("2")
        3 -> {
            println("3")
            println("Super!")
        }
        in 4..10 ->    println("od 4 do 10")
        -1,-2,-3,-4,-5 -> println("Liczba ujemna")
        else -> println("Pozostałe")
    }

    var str = when(numberWhen) {
        0 -> "O"
        1 -> "1"
        2 -> "2"
        else -> "Brak"
    }
    println(str)

    var first = 10
    var second = 20

    when {
        first > second  -> println("first > second")
        first < second -> println("first > second")
        else -> println("first = second")
    }

    var name: String? = "Tomek"
    var firstChar: Char

    if(name != null) {
        firstChar = name.first()
        println(firstChar)
    }

    firstChar = if(name != null) {
        name.first()
    } else {
        ' '
    }
    println(firstChar)

    firstChar = name?.first() ?: ' '
    println(firstChar)

    var a = 4
    var b = 5
    var c = 6
    var max = if(a > b) a else b
    max = if(max > c) max else c
    println(max)

    when (10) {
        a + b, a + c, b + c -> println("true")
        else -> println("false")
    }

    var numberMonth = 1
    var nameMonth = when(numberMonth) {
        1 -> "styczeń"
        2 -> "luty"
        3 -> "marzec"
        4 -> "kwiecień"
        5 -> "maj"
        5 -> "czerwiec"
        7 -> "lipiec"
        8 -> "sierpień"
        9 -> "wrzesień"
        10 -> "październik"
        11 -> "listopad"
        12 -> "grudzień"
        else -> "Brak"
    }
    println(nameMonth)

    var season = when(numberMonth) {
        in 3 ..5 -> "wiosna"
        in 6..8 -> "lato"
        in 9..11 -> "jesień"
        1,2,12 -> "zima"
        else -> "Brak"
    }
    println(season)
}