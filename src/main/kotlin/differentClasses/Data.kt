package differentClasses

data class Animal(val name: String, val kind: String)

fun main(){
    val animal = Animal("Shrek","dog")
    val animal2 = Animal("Shrek","dog")
    println(animal)
    println(animal2)
    println(animal == animal2)
}