package differentClasses

class Out {

    var number: Int = 7
    inner class Inner {
        fun add(){
            println(number)
        }
    }
}

class Mobile(val width: Double, val height: Double) {

    val thickness: Double = 3.0
    inner class Screen {
        val x = width - thickness
        val y = height - thickness
    }
}

fun main(){
    val screen = Mobile(700.0,1400.0).Screen()
    println(screen.x)
    println(screen.y)
}