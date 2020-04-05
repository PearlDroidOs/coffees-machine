import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val num = scanner.nextLine()

    println(if (num.length <= 1) 0 else num[num.length - 2])
}