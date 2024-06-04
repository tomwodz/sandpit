data class Product(val name: String, val price: Double, val category: String)
data class Student(val name: String, val grade: Int)

val produkty = listOf(
    Product("Koszulka", 49.99, "Odzież"),
    Product("Smartfon", 999.99, "Elektronika"),
    Product("Książka", 29.99, "Książki"),
    Product("Buty", 89.99, "Odzież"),
    Product("Laptop", 1499.99, "Elektronika"),
    Product("Kurtka", 149.99, "Odzież")
)

val students = listOf(
    Student("Jan", 4),
    Student("Anna", 5),
    Student("Piotr", 3),
    Student("Ewa", 5),
    Student("Tomasz", 4),
    Student("Kasia", 3)
)

fun main() {
    clothes()
    price()
    electronics()
    students()
}

fun clothes() {
    val listOfClothes = produkty.filter { it.category == "Odzież" }
    println(listOfClothes)
}

fun price() {
    val listOfProducts = produkty.filter { it.price > 100.00 }
    println(listOfProducts)
}

fun electronics() {
    val listOfElectronics = produkty.filter { it.category == "Elektronika" }
    println(listOfElectronics)
    val summaryPrice = listOfElectronics.sumOf { it.price }
    println(summaryPrice)
}

fun students() {
    val groupedStudents = students.groupBy { it.grade }.toSortedMap()
    println(groupedStudents)
}

