package interfaceEx

class Dog : Animal, Lazy {

    var barking: Boolean = false
    override fun go() {
        barking = false
        println("Go go go")
    }

    override fun voice() {
        barking = true
    }

    override fun sleep(time: Int) {
        for(i in 0..time) {
            println("Sssssssssssssssss")
        }
    }
}