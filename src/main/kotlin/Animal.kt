class Animal {
    var name: String? = null
    var kind: String? = null

    fun voice() {
        println("My name is $name, I'm $kind")
    }
}

class AnimalPrimary constructor(var name: String? = null, val kind: String? = null) {
    fun voice() {
        println("My name is $name, I'm $kind")
    }
}

class AnimalL(name: String, kind: String) {

    var full: String? = null
    init {
        full = "My name is $name, I'm $kind"
    }
    fun voice() {
        println("$full")
    }
}

class AnimalSecondary {

    var name: String? = null
    var kind: String? = null
    var age: Int? = null
    constructor(name: String?, kind: String?) {
        this.name = name
        this.kind = kind
    }
    constructor(name: String?, kind: String?, age: Int?) : this(name, kind) {
        this.age = age
    }
    fun voice() {
        println("My name is $name, I'm $kind")
    }
}

fun main(){
    var animal = Animal()
    animal.name = "Shrek"
    animal.kind = "dog"
    animal.voice()

    var animalPrimary = AnimalPrimary("Nina", "cat")
    animalPrimary.voice()

    var animalL = AnimalL("Didi", "bird")
    animalL.voice()

    var animalSecondary = AnimalSecondary("Czici", "dolphin")
    animalSecondary.voice()

    var animalSecondary2 = AnimalSecondary("Bem","bear",10)
    animalSecondary2.voice()
}