data class Word(val english: String, val spanish: String, val img: String? = null){
    fun sayIt() {
        println("Hola, $english is $spanish in Spanish!")
    }
}

fun main() {
    val boat = Word("boat", "el barco")
    boat.sayIt()
}