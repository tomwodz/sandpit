package model

class Teacher : Employee() {
    var subject: String? = null
}

fun main(){
    var employee = Employee()
    employee.name = "Justyna"
    employee.salary = 2000.00
    employee.info()

    var teacher = Teacher()
    teacher.name = "Tomek"
    teacher.salary = 1000.00
    teacher.subject = "Matematyka"
    teacher.info()
}