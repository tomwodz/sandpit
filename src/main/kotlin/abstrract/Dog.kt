package abstrract

class Dog(name: String) : Abstract(name) {
    override var age: Int = 9
    override fun smile() {
        println("Smilleeee :)")
    }
}