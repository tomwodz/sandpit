fun main(){
    var numberNull: Int?
    numberNull = 7
    //numberNull = null -> not exception print null
    println(numberNull?.plus(5))
}