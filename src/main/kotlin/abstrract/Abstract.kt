package abstrract

abstract class Abstract(var name: String) {

    abstract var age: Int
    abstract fun smile()
    fun voice(){
        println("I'm $name")
    }
}