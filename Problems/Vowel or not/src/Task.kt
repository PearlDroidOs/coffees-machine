import java.util.Scanner

// write your function here

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter.toUpperCase()))
}

fun isVowel(letter: Char): Boolean {
    return when (letter) {
        'A' -> true
        'E' -> true
        'I' -> true
        'O' -> true
        'U' -> true
        else -> false
    }
}