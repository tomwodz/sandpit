fun main(){
    for(i in 1..100){
        val result = when {
            i % 3 == 0 && i % 5 == 0 -> "Kajko i Kokosz"
            i % 3 == 0 || i % 5 == 0 -> if(i % 3 == 0) "Kajko" else "Kokosz"
            else -> i
        }
        println(result)
    }
}