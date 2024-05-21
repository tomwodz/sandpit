package differentClasses

fun main(){
    println(DaysOfTheWeek.Monday.name)
    println(DaysOfTheWeek.Monday.ordinal)

    println(DaysOfTheWeek.Saturday.name)
    println(DaysOfTheWeek.Saturday.ordinal)

    println(DaysOfTheWeek.values()[3].name)

    println(DaysOfTheWeek.valueOf("Monday"))

    println(DaysOfTheWeek2.Monday.namePL)

    val daysOfTheWeek: DaysOfTheWeek = DaysOfTheWeek.Monday

    when (daysOfTheWeek){
        DaysOfTheWeek.Monday -> println("Poniedziałek")
        DaysOfTheWeek.Tuesday -> println("Wtorek")
        DaysOfTheWeek.Wednesday -> println("Środa")
        DaysOfTheWeek.Thursday -> println("Czwartek")
        DaysOfTheWeek.Friday -> println("Piątek")
        DaysOfTheWeek.Saturday -> println("Sobota")
        DaysOfTheWeek.Sunday-> println("Niedziela")
    }
}