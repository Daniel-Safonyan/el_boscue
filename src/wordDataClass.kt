class Word(val english: String, val spanish: String, val img: String? = null){
    fun sayIt() {
        println("Hola, $english is $spanish in Spanish!")
    }
}

fun main() {
    val dog = Word("dog", "el perro","src/img/dog.jpg")
    dog.sayIt()
    val imgg = dog.img?: "no image"
    println(imgg)
}