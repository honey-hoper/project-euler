/**
* A palindromic number reads the same both ways. 
* The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
* Find the largest palindrome made from the product of two 3-digit numbers.
*
*/

fun main() {
	var a = 999
	var b = 999

	var palindrome = 0
	for (i in a downTo 100) {
		for (j in b downTo i) {
			val number = i * j
			if (number <= palindrome)
				break

			val reversed = reverse(number)
			if (number == reversed && number > palindrome) {
				palindrome = number
				break
			}
		}
	}
	println(palindrome)
}

fun reverse(number: Int): Int {
	var x = number
	var reversed = 0
	while (x != 0) {
		val r = x % 10
		reversed = reversed * 10 + r
		x = x / 10
	}
	return reversed
}
