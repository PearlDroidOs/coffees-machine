import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val inputStr = scanner.nextLine().split(" ")

    val num1 = inputStr[0].toLong()
    val operator = inputStr[1].toString()
    val num2 = inputStr[2].toLong()

    // write your code here
    println(when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "/" -> {
            if (num2 != 0L) num1 / num2 else "Division by 0!"
        }
        "*" -> num1 * num2
        else -> "Unknown operator"
    })
}