import kotlin.math.pow
import kotlin.math.absoluteValue

fun main() {
    var sum = 0
    var sumOfSquares = 0
    for (i in 1..100) {
        sumOfSquares += i.toDouble().pow(2).toInt()
        sum += i
    }

    val result = sumOfSquares - sum.toDouble().pow(2).toInt()
    println(result.absoluteValue)
}