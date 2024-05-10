package abstrract

class Person(name: String) : Abstract(name) {
    override var age: Int = 10
    override fun smile(){
        println("Smile! $name")
    }
}