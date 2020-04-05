import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val str = "You have chosen a "
    // write your code here
    println(when (scanner.nextInt()) {
        1 -> str + "square"
        2 -> str + "circle"
        3 -> str + "triangle"
        4 -> str + "rhombus"
        else -> "There is no such shape!"
    })
}