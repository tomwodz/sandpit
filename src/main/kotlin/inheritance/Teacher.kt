package inheritance

class Teacher(
    name: String,
    salary: Double,
    var subject: String
) : Employee(name, salary) {

    override var age: Int = 30

//var subject: String? = null

//    constructor(
//        name: String,
//        salary: Double,
//        subject: String
//    ) : super(name, salary){
//        this.subject = subject
//    }

    override fun info() {
        super.info()
        println("Uczę przedmiotu $subject")
    }

}