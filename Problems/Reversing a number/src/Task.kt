import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val num = scanner.nextLine()

    val d1 = num[0].toString()
    val d2 = num[1].toString()
    val d3 = num[2].toString()

    println(d3 + d2 + d1)
}