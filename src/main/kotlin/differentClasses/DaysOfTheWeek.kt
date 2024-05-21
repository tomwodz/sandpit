package differentClasses

enum class DaysOfTheWeek {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}

enum class DaysOfTheWeek2(val namePL: String) {
    Monday("Poniedziałek"),
    Tuesday("Wtorek"),
    Wednesday("Środa"),
    Thursday("Czwartek"),
    Friday("Piątek"),
    Saturday("Sobota"),
    Sunday("Niedziela")
}