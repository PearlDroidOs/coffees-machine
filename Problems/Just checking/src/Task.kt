import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    println(when (scanner.nextInt()) {
        1 -> "No!"
        2 -> "Yes!"
        3 -> "No!"
        4 -> "No!"
        else -> "Unknown number"
    })
}