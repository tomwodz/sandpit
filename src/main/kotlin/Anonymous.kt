fun main(){
    val square = object {
        var a: Int = 5
        fun area(): Int{
            return a * a
        }
    }

    println( square.area())

    val my = object : Square {
        override fun area(a: Int){
            println(a * a)
        }
    }

    my.area(6)

}

interface Square {
    fun area(a: Int)
}