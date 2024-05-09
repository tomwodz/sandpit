package inheritance

fun main() {
    var employee = Employee("Tom", 1000.00)
    var teacher = Teacher("Alex", 1000.00, "Historia")

    employee.info()
    teacher.info()

    var any = Any()
    teacher.toString()
    println( teacher.hashCode())

}