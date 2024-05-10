fun main() {
    for(i in 0..7){
        println(i)
    }

    println("-----------------------------------")

    //bez 7
    for(i in 0 until 7){
        println(i)
    }

    println("-----------------------------------")

    for(i in 0..7 step 3){
        println(i)
    }

    println("-----------------------------------")

    for(i in 7 downTo 0){
        println(i)
    }

    println("-----------------------------------")

    for(i in 7 downTo 0){
        println(i)
    }

    println("-----------------------------------")

    var i = 0
    while ( i < 5){
        println(i)
        i++
    }

    println("-----------------------------------")

    i = 0
    do {
        println(i)
        i++
    } while (i < 10)

    println("-----------------------------------")

    for(i in 0..7){
        if(i == 4) continue;
        println(i)
    }

    println("-----------------------------------")

    for(i in 0..7){
        if(i == 4) break;
        println(i)
    }

    println("-----------------------------------")

    var tab = intArrayOf(1,28,37978,48,588,68,789778)

    for(element in tab){
        println(element)
    }

    println("-----------------------------------")

    for(i in 0 until tab.size){
        println(tab.get(i))
    }

    println("-----------------------------------")

    for(i in tab.indices) {
        println(tab.get(i))
    }

    println("-----------------------------------")

    var numbersEven = 0
    for(i in tab.indices){
        if(tab.get(i) % 2 == 0) numbersEven++
    }
    println(numbersEven)

    println("-----------------------------------")

    for(i in tab.size - 1 downTo 0){
        println(tab[i])
    }

    println("-----------------------------------")

    for(i in 0..<5){
        println(i)
    }

    println("-----------------------------------")

    loopOne@ for(i in 0..7){
        loopTwo@ for(j in 1..7){
            println(j)
            if(i == j){
                break@loopOne
            }
        }
    }


}