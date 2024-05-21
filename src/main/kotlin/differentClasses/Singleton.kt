package differentClasses

fun main() {
    println(Config.name)
    Config.voice()

    val screen = Screen()
    screen.changeConfig()

    println(Config.name)
}

class Screen {
    fun changeConfig(){
        Config.name = "Dragon"
    }
}