class Text {
    lateinit var text: String
    fun saveText(info: String){
        this.text = info
    }
}

fun main(){
    val text = Text()
    text.saveText("Text")
    println(text.text)
}