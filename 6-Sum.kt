import kotlin.math.pow
import kotlin.math.absoluteValue

/**
*   The sum of the squares of the first ten natural numbers is,
*   1^2+2^2+...+10^2=385
*
*   The square of the sum of the first ten natural numbers is,
*   (1+2+...+10)2=552=3025
*
*   Hence the difference between the sum of the squares of the first ten natural numbers 
*   and the square of the sum is 3025−385=2640.
*   
*   Find the difference between the sum of the squares of the first one hundred natural numbers 
*   and the square of the sum.
 */

fun main() {
    val limit = 100
    var sum = limit * (limit + 1) / 2
    var sumOfSquares = (2 * limit + 1) * (limit + 1) * limit / 6

    val result = sumOfSquares - sum.toDouble().pow(2).toInt()
    println(result.absoluteValue)
}