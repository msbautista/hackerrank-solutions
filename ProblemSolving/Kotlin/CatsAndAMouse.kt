import kotlin.math.abs

//Problem: https://www.hackerrank.com/challenges/cats-and-a-mouse/
fun main(args: Array<String>) {
    val result = catAndMouse(2, 5, 4)
    println(result)
}

fun catAndMouse(a: Int, b: Int, c: Int): String {
    val distanceCatA = abs(a - c)
    val distanceCatB = abs(b - c)
    return if (distanceCatA == distanceCatB) {
        "Mouse C"
    } else if (distanceCatA < distanceCatB) {
        "Cat A"
    } else {
        "Cat B"
    }
}