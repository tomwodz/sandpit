package differentClasses

fun main(){
    val animal = object {
        var name: String = "Shrek"
        fun voice(){
            println("aaaaaa")
        }
    }
    println(animal.name)
    animal.voice()

    val listener = object : Listener {
        override fun onClick() {
           println("Click")
        }

    }

    listener.onClick()
}

interface Listener {
    fun onClick()
}