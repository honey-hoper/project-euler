import kotlin.math.sqrt
import kotlin.math.floor

/**
* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
* we can see that the 6th prime is 13.
* What is the 10 001st prime number?
*/

fun main() {
    var counter = 10001
    var current = 2
    while (counter > 0) {
        if (isPrime(current))
            counter--
        
        if (counter != 0)
            current++
    }
    println(current)
}


fun isPrime(x: Int): Boolean {
    for (i in 2..(floor(sqrt(x.toDouble())).toInt())) 
        if (x % i == 0)
            return false
    return true
}