package tasks

val list = listOf("Apple", null, "Banana", "Orange")
fun main() {
    println(list.safeGet(0))
    println(list.safeGet(1))
    println(list.safeGet(4))
    println("--------------------")
    println(list.safeGetOrNull(0))
    println(list.safeGetOrNull(1))
    println(list.safeGetOrNull(4))
    println("-----------------------------------------------------")
    println(list.safeGetOrDefault(0, "default"))
    println(list.safeGetOrDefault(1, "default"))
    println(list.safeGetOrDefault(4, "default"))
    println("--------------------")
    println(list.safeGetOrDefaultWithGetOrNull(0, "default"))
    println(list.safeGetOrDefaultWithGetOrNull(1, "default"))
    println(list.safeGetOrDefaultWithGetOrNull(4, "default"))
    println("-----------------------------------------------------")
    println(list.safeGetOrElse(0) { null })
    println(list.safeGetOrElse(1) { "default" })
    println(list.safeGetOrElse(4) { list.safeGetOrDefault(4, "default") })
    println("--------------------")
    println(list.safeGetOrElseWithGetOrElse(0) { null })
    println(list.safeGetOrElseWithGetOrElse(1) { "default" })
    println(list.safeGetOrElseWithGetOrElse(4) { list.safeGetOrDefault(4, "default") })
}

fun <T> List<T>.safeGet(index: Int): T? {
    return try {
        this[index]
    } catch (e: ArrayIndexOutOfBoundsException) {
        null
    }
}

fun <T> List<T>.safeGetOrNull(index: Int): T? {
    return getOrNull(index)
}

fun <T> List<T>.safeGetOrDefault(index: Int, default: T): T? {
    return try {
        this[index] ?: default
    } catch (e: ArrayIndexOutOfBoundsException) {
        default
    }
}

fun <T> List<T>.safeGetOrDefaultWithGetOrNull(index: Int, default: T): T? {
    return getOrNull(index) ?: default
}

fun <T> List<T>.safeGetOrElse(index: Int, defaultProvider: () -> T): T? {
    return try {
        this[index] ?: defaultProvider.invoke()
    } catch (e: ArrayIndexOutOfBoundsException) {
        defaultProvider.invoke()
    }
}

fun <T> List<T>.safeGetOrElseWithGetOrElse(index: Int, defaultProvider: () -> T): T? {
    return this.getOrElse(index) {
        defaultProvider.invoke()
    } ?: defaultProvider.invoke()
}