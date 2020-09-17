class Word(val english: String, val spanish: String, val img: String? = null){
    fun sayIt() {
        println("Hola, $english is $spanish in Spanish!")
    }
}

fun main() {
    val string = "String"

    try {
        val int = string.toInt()
    } catch (exeption: NumberFormatException) {
        println("Exception: $exeption")
    }

    val strName = "Danny"

    println(strName.hashCode())
}