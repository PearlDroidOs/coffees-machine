import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()

    val isCheck = if (num1 > 0 && num2 <= 0 && num3 <= 0) {
        true
    } else if (num1 <= 0 && num2 > 0 && num3 <= 0) {
        true
    } else {
        num1 <= 0 && num2 <= 0 && num3 > 0
    }

    println(isCheck)
}