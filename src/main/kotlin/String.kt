fun main() {
    var str: String = "Tekst"
    var msg = "Kolejny tekst"
    var strMsg = str + msg
    println(strMsg)

    println(str.length)

    var someStr = str.substring(0, 2)
    println(someStr)

    var startStr = str.startsWith("T");
    println(startStr)

    println(str[0])

    for (i in str) {
        println(i)
    }

    var longStr = "First" +
            "Second" +
            "Next"

    println(longStr)

    var longNStr = "First\nSecond\nNext"
    println(longNStr)

    var rawStr = """
        First
        Second
        Next
    """.trimIndent()

    println(rawStr)

    var common = "$str$msg"
    println(common)

    var number = 777
    println("Number: $number")

    println("Length $str to ${str.length}")

    var str2 = "Tekst"

    println(str == str2)
    println(str === str2)

    var name: String? = "Tomek"
    //name = null
    if(name != null){
        println("Mam na imię $name")
    } else {
        println("Brak imienia")
    }

    var nameSample = name ?: "brak"
    println(nameSample)

    var text = "daaddasdsada@fsdfsdfds"
    println(text)
    var charSample = text.toCharArray()
    println(charSample.size)
    for (i in charSample.indices){
        if(charSample[i] == '@'){
            charSample[i] = 'X'
        }
    }
    println(charSample)

    var strReplace = text.replace('@','X')
    println(strReplace)

    var text2 ="Ala ma kota"
    var textReplace = text2.replace("ma","nie ma")
    println(textReplace)

}