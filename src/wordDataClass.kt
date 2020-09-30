data class Word(val english: String, val topic: String, val spanish: String, val img: String? = null){
    fun sayIt() {
        println("Hola, $english is $spanish in Spanish!")
    }
}

abstract class Dictionary<T>(open val topic: String) {
    val dictionary: MutableList<T> = mutableListOf()
}

class irregularVerbsDictionary<T>(override val topic: String): Dictionary<T>(topic){

}

fun main() {
val newClass = 12

    val newClas1s = 23
}