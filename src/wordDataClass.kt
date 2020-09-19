data class Word(val english: String, val spanish: String, val img: String? = null){
    fun sayIt() {
        println("Hola, $english is $spanish in Spanish!")
    }
}

class Dictionary<Word> {
    val dictionary: MutableList<Word> = mutableListOf()
}

fun main() {
    val boat = Word("boat", "el barco")
    boat.sayIt()
}